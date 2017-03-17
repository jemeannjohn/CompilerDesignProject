## Introduction

JAJ is a procedural programming language which is similar to C.
The Lexing and Parsing phases were implemented using ANTLR4 tool and JAVA
The runtime environment is in python.

Youtube Link :- https://www.youtube.com/watch?v=2nJaYDFsSGo
Github Repo :- https://github.com/Jyotinder/JAJ

## Sample Programs

Code examples are enclosed in the 'src/main/jaj' folder with .jaj extensions

## Coursework

JAJ was implemented as part of SER 502, Compiler design and programming paradigms course at ASU.


## Installation

1) Install antlr4 tool and set it up for eclipse. The detailed installation steps are given in :-
http://stackoverflow.com/questions/30128961/trouble-setting-up-antlr-4-ide-on-eclipse-luna-4-4

2) Once antlr has been setup, source code should be installed from the github repo :
https://github.com/Jyotinder/JAJ

3) Once the setup has been done run the grammar file JAJ.g4
using the command       
				 java –jar -visitor <path-to-antlr-jar-file> JAJ.g4
4) this should generate the lexer,parser,listener and visitor classes.

5) once this is done run Main.java, by passing the source .jaj file as input
				java Main.java <source-file-path.jaj>

6) this will generate the intermediate file with .jaji extension

7) run the python environment with intermediate file as input
				python runtime.py –f <intermediate-file-path.jaji>


## Links 

Youtube Link :- https://www.youtube.com/watch?v=2nJaYDFsSGo
Github Repo :- https://github.com/Jyotinder/JAJ



## Contributors

Jyotinder Pal Singh,
Ayush Gupta,
Jeme John.
