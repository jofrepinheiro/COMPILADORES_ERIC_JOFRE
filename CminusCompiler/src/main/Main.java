package main;

  
import java.io.FileReader;
import java.io.PushbackReader;

import cminus.node.Start;
import cminus.parser.Parser; 
  
public class Main { 
   public static void main(String[] args) throws Exception { 
      if (args.length > 0) { 
         try { 
            /* Form our AST */ 
        	 MyLexer lexer = new MyLexer (new PushbackReader( 
               new FileReader(args[0]), 1024)); 
        	 
        	 while(!lexer.peek().getText().equals("")) 
	         { 
        		String token = (lexer.peek().getClass().toString()); 
        		
//        		switch (token) {
//				case "*Num": 
//					token = "num";
//					break;
//				case "*Blank": 
//					token = "blank";
//					break;
//				case "*Plus": 
//					token = "plus";
//					break;
//				case "*TComment": 
//					token = "comment";
//					break;
//				case "*TShortComment": 
//					token = "shortComment";
//					break;
//				case "*Semi": 
//					token = "semicolon";
//					break;
////				case "*Num": 
////					token = "num";
////					break;
//				default:
//					break;
//				}
        		  System.out.println("["+token+"]");
	          	lexer.next(); 
	         } 

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
         System.err.println("usage: java cminus inputFile"); 
         System.exit(1); 
      } 
   } 
}