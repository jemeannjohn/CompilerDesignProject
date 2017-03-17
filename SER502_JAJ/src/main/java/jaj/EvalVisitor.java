package main.java.jaj;


import org.antlr.v4.runtime.misc.NotNull;

import jaj.JAJBaseVisitor;
import jaj.JAJParser;
import jaj.JAJParser;
import jaj.JAJParser.AdditiveExprContext;
import jaj.JAJParser.AtomExprContext;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class EvalVisitor extends JAJBaseVisitor<Value> {
	public PrintWriter writer;
    
	public EvalVisitor(PrintWriter writer) throws FileNotFoundException {
		this.writer = writer;
	}
	// used to compare floating point numbers
	public int LabelCount = 0;
    public static final double SMALL_VALUE = 0.00000000001;
    public List<String> booleanVars = new ArrayList<String>();
    
    

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();
    @Override 
    public Value visitGlobal_scope(JAJParser.Global_scopeContext ctx) {
    	System.out.println("GLOBAL_START");
    	writer.println("GLOBAL_START");
    	this.visit(ctx.block());
    	System.out.println("GLOBAL_END");
    	writer.println("GLOBAL_END");
    	return null;
    }
    
    @Override 
    public Value visitBlock_scope(JAJParser.Block_scopeContext ctx) { 
    	System.out.println("BLOCK");
    	writer.println("BLOCK");
    	this.visit(ctx.block());
    	System.out.println("BLOCK_END");
    	writer.println("BLOCK_END");
    	return null; 
    }
	
	
    @Override 
    public Value visitBlock(JAJParser.BlockContext ctx) { 
    	if(ctx.getChild(0).getText().equals("[")) {
    		System.out.println("BLOCK");
    	}
    	else if(ctx.getChild(0).getText().equals("<")) {
    		System.out.println("GLOBAL_START");
    	}
    	for(int i=0; i< ctx.stat().size();i++){
    		this.visit(ctx.stat(i));
    	}
    	if(ctx.getChild(0).getText().equals("[")) {
    		System.out.println("BLOCK_END");
    	}
    	else if(ctx.getChild(0).getText().equals("<")) {
    		System.out.println("GLOBAL_END");
    	}
    	return null;
    	
    }

    // assignment/id overrides
    @Override
    public Value visitAssignment(JAJParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(ctx.stack_top() != null){
        	System.out.println("TOPS VAR_"+ctx.stack_top().ID());
        	System.out.println("MOV VAR_"+ctx.getChild(0).toString()+" EAX");
        	writer.println("TOPS VAR_"+ctx.stack_top().ID());
        	writer.println("MOV VAR_"+ctx.getChild(0).toString()+" EAX");
        }
        else if(ctx.functionCall() != null){ 
        	value = this.visit(ctx.functionCall());
        	if(booleanVars.contains(ctx.getChild(0).toString())){
        		System.out.println("MOV VARB_"+ctx.getChild(0).toString()+" "+value);
        		writer.println("MOV VARB_"+ctx.getChild(0).toString()+" "+value);
        	
        	} else{
        		System.out.println("MOV VAR_"+ctx.getChild(0).toString()+" "+value);
        		writer.println("MOV VAR_"+ctx.getChild(0).toString()+" "+value);
        	}
        }
        else if((ctx.expr().getText()).equals("true"))  {
        	System.out.println("VARB_"+ctx.getChild(0).toString() + " 1");
        	writer.println("VARB_"+ctx.getChild(0).toString() + " 1");
        	booleanVars.add(ctx.getChild(0).toString());
        }
        else if((ctx.expr().getText()).equals("false")){
        	System.out.println("VARB_"+ctx.getChild(0).toString() + " 0");
        	writer.println("VARB_"+ctx.getChild(0).toString() + " 0");
        	booleanVars.add(ctx.getChild(0).toString());
        }
        else if (isInteger(ctx.expr().getText())) {
        	System.out.println("VAR_" + ctx.getChild(0).toString() + " " + ctx.expr().getText());
        	writer.println("VAR_" + ctx.getChild(0).toString() + " " + ctx.expr().getText());
    	}
        else{
        	value = visit(ctx.expr());
        	if(booleanVars.contains(ctx.getChild(0).toString())){
        		System.out.println("MOV VARB_"+ctx.getChild(0).toString()+" "+value);
        		writer.println("MOV VARB_"+ctx.getChild(0).toString()+" "+value);
        	
        	} else{
        		System.out.println("MOV VAR_"+ctx.getChild(0).toString()+" "+value);
        		writer.println("MOV VAR_"+ctx.getChild(0).toString()+" "+value);
        	}
        }
        return memory.put(id, value);
    }
    
    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }
    
    public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
    }
   
    @Override 
    public Value visitFunctionDefinition(JAJParser.FunctionDefinitionContext ctx) { 
    	//System.out.println(ctx.ID(0).toString().toUpperCase()+"_START");
    	String s = ctx.ID(0).toString().toUpperCase()+"_START";
    	for(int i=1; i < ctx.ID().size();i++){
    		if(booleanVars.contains(ctx.ID(i).getText())){ 
    			s = s + " VARB_"+ctx.ID(i).getText();
    		} else {
    			s = s+ " VAR_"+ctx.ID(i).getText();
    		}
    	}
    	System.out.println(s);
    	writer.println(s);
    	visitChildren(ctx); 
    	System.out.println(ctx.ID(0).toString().toUpperCase()+"_END");
    	writer.println(ctx.ID(0).toString().toUpperCase()+"_END");
    	return null;
    }
    
    @Override 
    public Value visitFunctionCall(JAJParser.FunctionCallContext ctx) { 
    	this.visitChildren(ctx);
    	for(int i=0;i<ctx.paramDefs().getChildCount();i++){
    		if(!(ctx.paramDefs().getChild(i).toString().equals(","))){
    			System.out.println("PUSH VAR_"+ctx.paramDefs().getChild(i));
    			writer.println("PUSH VAR_"+ctx.paramDefs().getChild(i));
    		}
//    		if(!(ctx.paramDefs().getChild(i).toString().equals(","))){
//    			this.visit(ctx.paramDefs().getChild(i));
//    			
//    		}
    	}
    	System.out.println("CALL "+ctx.ID().toString().toUpperCase()+"_START");
    	writer.println("CALL "+ctx.ID().toString().toUpperCase()+"_START");
    	//return visitChildren(ctx);
    	return new Value("EAX");
    }
	
    @Override 
    public Value visitParamDefs(JAJParser.ParamDefsContext ctx) { 
    	return visitChildren(ctx); 
    }

    @Override
    public Value visitIdAtom(JAJParser.IdAtomContext ctx) {
        String id = ctx.getText();
//        Value value = memory.get(id);
//        if(value == null) {
//            throw new RuntimeException("no such variable: " + id);
//        }
        return new Value(ctx.getText());
    }

    // atom overrides
    @Override
    public Value visitStringAtom(JAJParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(JAJParser.NumberAtomContext ctx) {
        return new Value(Integer.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(JAJParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(JAJParser.NilAtomContext ctx) {
        return new Value(null);
    }
    
    @Override 
    public Value visitStack_init(JAJParser.Stack_initContext ctx) { 
    	System.out.println("STACK VAR_"+ctx.ID().getText());
    	writer.println("STACK VAR_"+ctx.ID().getText());
    	return visitChildren(ctx); 
    }
	
    @Override 
    public Value visitStack_operations(JAJParser.Stack_operationsContext ctx) { 
    	if(ctx.getChild(0).getText().equals("spush")) {
    		System.out.println("STACK_PSHS VAR_"+ctx.ID().getText() +" "+ ctx.INT().getText());
    		writer.println("STACK_PSHS VAR_"+ctx.ID().getText() +" "+ ctx.INT().getText());
    	}
    	else if(ctx.getChild(0).getText().equals("spop")) {
    		System.out.println("STACK_POP VAR_"+ctx.ID().getText());
    		writer.println("STACK_POP VAR_"+ctx.ID().getText());
    	}
    	else if(ctx.getChild(0).getText().equals("empty")) {
    		System.out.println("EMPTY VAR_"+ctx.ID().getText());
    		writer.println("EMPTY VAR_"+ctx.ID().getText());
    	}
    	
    	return visitChildren(ctx); 
    }
	
    
    // expr overrides
    @Override
    public Value visitParExpr(JAJParser.ParExprContext ctx) {
    	
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitPowExpr(JAJParser.PowExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    @Override
    public Value visitUnaryMinusExpr(JAJParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(JAJParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println("NOT VAR_"+ctx.expr().getText());
        writer.println("NOT VAR_"+ctx.expr().getText());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(@NotNull JAJParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        String op1 = left.asString(), op2 = right.asString();
        String operator = "MUL";
        Value returnValue = null;
        int flagl = 0, flagr = 0;
        
        try{
        	op1 = ""+Integer.parseInt(left.toString());
        	
        }
        catch(Exception e){
        	if(left.toString().equals("EAX")){
        		op1 = "EAX";
        	}
        	else{
        		op1 = "VAR_"+left.toString();
        	}
        }
        try{
        	op2 = ""+Integer.parseInt(right.toString());
        	
        }
        catch(Exception e){
        	if(right.toString().equals("EAX")){
        		op2 = "EAX";
        	}
        	else{
        		op2 = "VAR_"+right.toString();
        	}
//        	op2 = "VAR_"+right.toString();
        }

        switch (ctx.op.getType()) {
            case JAJParser.MULT:
            	operator = "MUL";
            	break;
            case JAJParser.DIV:
            	operator = "DIV";
            	break;
            case JAJParser.MOD:
            	operator = "MOD";
            	break;
                
        }
        System.out.println(operator + " " + op1+ " " + op2);
        writer.println(operator + " " + op1+ " " + op2);
        return new Value("EAX");
    }

    @Override
    public Value visitAdditiveExpr(@NotNull JAJParser.AdditiveExprContext ctx) {
    	//System.out.println("expr ctx = "+ctx.getText());
    	Value left = new Value(ctx.expr(0).getText());
        Value right = new Value(ctx.expr(1).getText());

        left = this.visit(ctx.expr(0));
        right = this.visit(ctx.expr(1));
        String op1 = left.asString(), op2 = right.asString();
        String operator = "ADD";
        
        try{
        	op1 = ""+Integer.parseInt(left.toString());
        	
        }
        catch(Exception e){
        	if(left.toString().equals("EAX")){
        		op1 = "EAX";
        	}
        	else{
        		op1 = "VAR_"+left.toString();
        	}
        }
        try{
        	op2 = ""+Integer.parseInt(right.toString());
        	
        }
        catch(Exception e){
        	if(right.toString().equals("EAX")){
        		op2 = "EAX";
        	}
        	else{
        		op2 = "VAR_"+right.toString();
        	}
        }
        
        
        switch (ctx.op.getType()) {
        	case JAJParser.PLUS:
        		operator = "ADD";
        		break;
            case JAJParser.MINUS:
            	operator = "SUB";
            	break;
            
        }
        System.out.println(operator+ " " + op1 + " " + op2);
        writer.println(operator+ " " + op1 + " " + op2);
        return new Value("EAX");
    }

    @Override
    public Value visitRelationalExpr(@NotNull JAJParser.RelationalExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        
        System.out.println("CMP "+left+ " " +right);
        writer.println("CMP "+left+ " " +right);
        
        switch (ctx.op.getType()) {
            case JAJParser.LT:
            	System.out.println("JGE LABEL_"+LabelCount);
            	writer.println("JGE LABEL_"+LabelCount);
            	break;
                
            case JAJParser.LTEQ:
            	System.out.println("JGT LABEL_"+LabelCount);
            	writer.println("JGT LABEL_"+LabelCount);
            	break;
            case JAJParser.GT:
            	System.out.println("JLE LABEL_"+LabelCount);
            	writer.println("JLE LABEL_"+LabelCount);
            	break;
            case JAJParser.GTEQ:
            	System.out.println("JLT LABEL_"+LabelCount);
            	writer.println("JLT LABEL_"+LabelCount);
            	break;
            default:
                throw new RuntimeException("unknown operator: " + JAJParser.tokenNames[ctx.op.getType()]);
        }
        return new Value("LABEL_"+LabelCount++);
    }

    @Override
    public Value visitEqualityExpr(@NotNull JAJParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
		if(booleanVars.contains(left.toString()) && booleanVars.contains(right.toString())){
			left = new Value("VARB_"+left.asString());
			right = new Value("VARB_"+right.asString());
		}
		else if(!isInteger(left.toString())){
        	left = new Value("VAR_"+left.asString());
        }
		else if(!isInteger(right.toString())){
        	right = new Value("VAR_"+right.asString());
        }

        switch (ctx.op.getType()) {
            case JAJParser.EQ:
            	System.out.println("CMP "+left+ " "+ right);
            	System.out.println("JNE LABEL_"+LabelCount);
            	writer.println("CMP "+left+ " "+ right);
            	writer.println("JNE LABEL_"+LabelCount);
                return new Value("LABEL_"+LabelCount++);
                        
            case JAJParser.NEQ:
            	System.out.println("CMP "+left+ " "+ right);
            	System.out.println("JE LABEL_"+LabelCount);
            	writer.println("CMP "+left+ " "+ right);
            	writer.println("JE LABEL_"+LabelCount);
                return new Value("LABEL_"+LabelCount++);
            default:
                throw new RuntimeException("unknown operator: " + JAJParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(JAJParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        System.out.println("AND VARB_"+ctx.expr(0).getText()+" VARB_"+ctx.expr(1).getText());
        writer.println("AND VARB_"+ctx.expr(0).getText()+" VARB_"+ctx.expr(1).getText());
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(JAJParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        System.out.println("OR VARB_"+ctx.expr(0).getText()+" VARB_"+ctx.expr(1).getText());
        writer.println("OR VARB_"+ctx.expr(0).getText()+" VARB_"+ctx.expr(1).getText());
        return new Value(left.asBoolean() || right.asBoolean());
    }
    
    @Override 
    public Value visitReturn_stat(JAJParser.Return_statContext ctx) {
    	if(isInteger(ctx.getChild(1).getText())){
    		System.out.println("RET " + ctx.getChild(1).getText());
    		writer.println("RET " + ctx.getChild(1).getText());
    	}
    	else{
    		writer.println("RET VAR_" + ctx.getChild(1).getText());
    	}
    	return visitChildren(ctx);
    }
    
    @Override 
    public Value visitPrint(JAJParser.PrintContext ctx) {
    	if(ctx.STRING() != null){
    		System.out.println("PRINT " + ctx.STRING().getText());
    		writer.println("PRINT " + ctx.STRING().getText());
    	} else {
    		if(booleanVars.contains(ctx.ID().getText())){
    			System.out.println("PRINT VARB_" + ctx.ID().getText());
	    		writer.println("PRINT VARB_" + ctx.ID().getText());
    		}else{
	    		System.out.println("PRINT VAR_" + ctx.ID().getText());
	    		writer.println("PRINT VAR_" + ctx.ID().getText());
    		}
    	}
    	return null;
    }
    
    // log override
    @Override
    public Value visitLog(JAJParser.LogContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        writer.println(value);
        return value;
    }

    // if override
    @Override
    public Value visitIf_stat(JAJParser.If_statContext ctx) {

        List<JAJParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;
        Value label = null;
        for(JAJParser.Condition_blockContext condition : conditions) {
        	if(label != null){
        		System.out.println(label);
        		writer.println(label);
        	}
        	
            label = this.visit(condition.expr());
            this.visit(condition.stat_block());
            
        }
        System.out.println("JMP LABEL_"+LabelCount);
        writer.println("JMP LABEL_"+LabelCount);
        System.out.println(label);
        writer.println(label);
        if(ctx.getText().contains("else{")){
        	this.visit(ctx.stat_block());	
        }
        System.out.println("LABEL_"+LabelCount++);
        writer.println("LABEL_"+LabelCount++);
        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(JAJParser.While_statContext ctx) {
    	String while_label = "LABEL_"+LabelCount++;  
    	System.out.println(while_label);
        writer.println(while_label);
        Value value = this.visit(ctx.expr());
        
        this.visit(ctx.stat_block());
        System.out.println("JMP "+while_label);
        System.out.println(value);
        writer.println("JMP "+while_label);
        writer.println(value);
        return Value.VOID;
    }
}