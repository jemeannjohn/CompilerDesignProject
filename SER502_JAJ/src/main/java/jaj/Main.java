package main.java.jaj;

import java.io.PrintWriter;
import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import jaj.JAJLexer;
import jaj.JAJParser;


public class Main {

	public static void main(String[] args) throws Exception {

		if (args.length == 0) {
			args = new String[] { "test_exp.jaj" };
		}

		System.out.println("parsing: " + args[0]);

		JAJLexer lexer = new JAJLexer(new ANTLRFileStream("src/main/jaj/"+args[0]));
		JAJParser parser = new JAJParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.parse();
		PrintWriter writer = new PrintWriter("src/main/jaj/"+args[0]+"i");
		System.out.println("\n");
		EvalVisitor visitor = new EvalVisitor(writer);
		visitor.visit(tree);
		writer.close();
	}
}