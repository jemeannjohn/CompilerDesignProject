import os
import argparse
import sys

class Stack:
  def __init__(self):
    self.__storage = []

  def isEmpty(self):
    if len(self.__storage) == 0:
        return 1
    else:
        return 0

  def push(self,p):
    self.__storage.append(p)

  def pop(self):
    return self.__storage.pop()

  def size(self):
    return len(self.__storage)

  def top(self):
    if not self.isEmpty():
        return self.__storage[-1]



class interp:
    def __init__(self,code):
        self.g_symtable={}
        self.gobal=[]
        self.EIP=0
        self.code=code
        self.datatype=['INT','FLOAT','BOOL']
        self.localstack={}
        self.stacklocal=[]
        self.callstack=[]
        self.funarg=[]
        self.debug=0
        self.EAX=int(0)
        self.R=0
        self.skiprange=[sys.maxint,sys.maxint]
        if self.debug:
            print code

    def get_variable(self):
        pass

    def block_start(self):
        self.stacklocal.append(self.localstack)
        self.localstack ={}

    def block_end(self):
        #self.stacklocal.append(self.localstack)


        if self.stacklocal[-1] is not None:
            self.localstack =self.stacklocal[-1]
            self.stacklocal=self.stacklocal[:-1]
        else:
            self.localstack={}

    def global_var(self):
        for index,name in enumerate(self.code):
            if name == "GLOBAL_START":
                index+=1
                while(self.code[index]!="GLOBAL_END"):
                    gobal= (self.code[index]).split()
                    self.g_symtable[gobal[0]]=gobal[1]
                    index+=1
                break

    def FIND_IP(self,func):
        for index,name in enumerate(self.code):
            if func in name and self.EIP!=index :
                self.EIP=index
                break

    def FIND_END(self):
        for index,name in enumerate(self.code):
            if name == "MAIN_END":
                self.EIP=index
                break

    def set_scope(self,temp,val):
        if temp in self.localstack.keys():
            #print self.localstack[temp]
            self.localstack[temp]=val
        elif temp in "EAX":
            self.EAX=val
        elif self.set_intermidiate(temp,val) is None:
            if temp in self.g_symtable.keys():
                #print self.g_symtable[temp]
                self.g_symtable[temp]=val


    def set_intermidiate(self,key,val):
        for i in reversed(self.stacklocal):
            if key in i:
                i[key]=val
                return 1
        return None

    def intermidiate(self,key):
        for i in reversed(self.stacklocal):
            if key in i:
                return i[key]
        return None

    def scope(self,temp):
        if temp in self.localstack.keys():
            #print self.localstack[temp]
            return self.localstack[temp]
        val = self.intermidiate(temp)
        if val is not None:
            #print self.localstack[temp]
            return val
        elif temp in self.g_symtable.keys():
            #print self.g_symtable[temp]
            return self.g_symtable[temp]
        else:
            print "scope ERROR"

    def parse(self,ln):
        if self.debug:
         self.print_ln()
        temp=ln.split()
        opcode=temp[0]
        if "START" in temp[0]:
            self.localstack={}
            if len(self.funarg)>0:
                for i,val in enumerate(self.funarg):
                    self.localstack[temp[i+1]]=self.funarg[i]
                self.funarg=[]
        elif opcode[:3]=="VAR":
            self.localstack[temp[0]]=int (temp[1])
        elif opcode=="PRINT":
            if "VAR" in temp[1]:
                val=self.scope(temp[1])
                if "VARB" in temp[1]:
                    if val ==1:
                        print "true"
                    else:
                        print "false"
                else:
                    print val
            elif "EAX" in temp[1]:
                print(self.EAX)
            else:
                str=""
                for x in temp[1:]:
                    str=str+" "+x
                print str[1:]
        elif opcode =="PUSH":
            if "EAX" in temp[1]:
                self.funarg.append(self.EAX)
            else:
                self.funarg.append(self.scope(temp[1]))
        elif opcode =="CALL":
            self.callstack.append((self.localstack,self.EIP+1))
            self.FIND_IP(temp[1])
            self.EIP-=1
        elif opcode=="CMP":
            var1=0
            var2=0

            if "VARB" in temp[1]:
                var1=int(self.scope(temp[1]))
            elif "VAR" in temp[1]:
                var1=int(self.scope(temp[1]))
            else:
                var1=int(temp[1])

            if "VARB" in temp[2]:
                var2=int(self.scope(temp[2]))
            elif "VAR" in temp[2]:
                var2=int(self.scope(temp[2]))
            else:
                var2=int(temp[2])
            if var1==var2:
                self.R=0
            elif var1>var2:
                self.R=1
            else:
                self.R=-1
        elif opcode=="JNE":
            if self.R is not 0:
                self.FIND_IP(temp[1])
        elif opcode=="JLE":
            if self.R is -1:
                self.FIND_IP(temp[1])
        elif opcode=="JMP":
            self.FIND_IP(temp[1])
        elif opcode=="JGE":
            if self.R is 1:
                self.FIND_IP(temp[1])
        elif opcode=="JE":
            if self.R is 0:
                self.FIND_IP(temp[1])
        elif opcode=="MOV":
            var1 = 0
            if "VAR" in temp[2]:
                var1=int(self.scope(temp[2]))
                self.set_scope(temp[1],var1)
            else:
                self.set_scope(temp[1],int(self.EAX))
        elif opcode=="SUB":
            self.EAX=int(self.EAX)
            var1=0
            var2=0
            if "VAR" in temp[1]:
                var1=int(self.scope(temp[1]))
            else:
                if "EAX" in temp[1]:
                    var1=self.EAX
                else:
                    var1=int(temp[1])

            if "VAR" in temp[2]:
                var2=int(self.scope(temp[2]))
            else:
                if "EAX" in temp[2]:
                    var2=self.EAX
                else:
                    var2=int(temp[2])
            self.EAX=var1-var2
        elif opcode=="RET":
            if "VAR" in temp[1]:
                self.EAX=int(self.scope(temp[1]))
            self.stackunwind()
        elif opcode=="MUL":
            self.EAX=int(self.EAX)

            var1=0
            var2=0
            if "VAR" in temp[1]:
                var1=int(self.scope(temp[1]))
            else:
                if "EAX" in temp[1]:
                    var1=self.EAX
                else:
                    var1=int(temp[1])

            if "VAR" in temp[2]:
                var2=int(self.scope(temp[2]))
            else:
                if "EAX" in temp[2]:
                    var2=self.EAX
                else:
                    var2=int(temp[2])
            self.EAX=var1*var2
        elif opcode=="ADD":
            self.EAX=int(self.EAX)
            var1=0
            var2=0
            if "VAR" in temp[1]:
                var1=int(self.scope(temp[1]))
            else:
                if "EAX" in temp[1]:
                    var1=self.EAX
                else:
                    var1=int(temp[1])

            if "VAR" in temp[2]:
                var2=int(self.scope(temp[2]))
            else:
                if "EAX" in temp[2]:
                    var2=self.EAX
                else:
                    var2=int(temp[2])
            self.EAX=var1+var2
        elif opcode=="DIV":
            self.EAX=int(self.EAX)
            var1=0
            var2=0
            if "VAR" in temp[1]:
                var1=int(self.scope(temp[1]))
            else:
                if "EAX" in temp[1]:
                    var1=self.EAX
                else:
                    var1=int(temp[1])

            if "VAR" in temp[2]:
                var2=int(self.scope(temp[2]))
            else:
                if "EAX" in temp[2]:
                    var2=self.EAX
                else:
                    var2=int(temp[2])
            self.EAX=var1/var2

        elif opcode=="STACK":
            self.localstack[temp[1]]=Stack()
        elif opcode=="STACK_PSHS":
            var1=self.scope(temp[1])
            var1.push(int(temp[2]))
        elif opcode=="STACK_POP":
            var1=self.scope(temp[1])
            var1.pop()
        elif opcode=="TOPS":
            var1=self.scope(temp[1])
            self.EAX=var1.top()
        elif opcode=="EMPTY":
            var1=self.scope(temp[1])
            self.EAX=var1.isEmpty()

        elif opcode=="BLOCK":
            self.block_start()
        elif opcode=="BLOCK_END":
            self.block_end()

    def stackunwind(self):
        if len(self.callstack) >0:
            self.localstack,self.EIP=self.callstack[-1]
            self.EIP-=1
            del self.callstack[-1]


    def execute(self):
        self.global_var()
        self.FIND_IP("MAIN_START")
        while(self.code[self.EIP]!="MAIN_END"):
            self.parse(self.code[self.EIP])
            self.EIP +=1
        self.parse(self.code[self.EIP])

    def print_ln(self):
        print(self.code[self.EIP]," Line",self.EIP)


def main():
    code=[]
    parser = argparse.ArgumentParser()
    parser.add_argument('-f', "--folderpath", help="ASSM file required", required=True)
    args = vars(parser.parse_args())
    file=args['folderpath']
    fin= open(file,"r")
    code = fin.read().splitlines()

    In=interp(code)
    In.execute()



if __name__ == '__main__':
    main()