package main;

  
import java.io.FileReader;
import java.io.PushbackReader;

import cminus.interpret.Interpreter;
import cminus.lexer.Lexer;
import cminus.node.Start;
import cminus.parser.Parser; 
  
public class Main { 
   public static void main(String[] args) throws Exception { 
      if (args.length > 0) { 
         try { 
            /* Form our AST */ 
        	 MyLexer lexer = new MyLexer (new PushbackReader( 
               new FileReader(args[0]), 1024)); 
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ; 
  
            /* Get our Interpreter going. */ 
            Interpreter interp = new Interpreter () ; 
            ast.apply(interp) ; 
         } 
         catch (Exception e) { 
            throw e;
         } 
      } else { 
         System.err.println("usage: java Cminus inputFile"); 
         System.exit(1); 
      } 
   } 
}