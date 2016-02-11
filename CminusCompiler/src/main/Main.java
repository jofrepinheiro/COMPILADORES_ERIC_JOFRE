package main;

  
import java.io.FileReader;
import java.io.PushbackReader;

import cminus.node.Start;
import cminus.node.Token;
import cminus.parser.Parser; 
  
public class Main { 
   public static void main(String[] args) throws Exception { 
      if (args.length > 0) { 
         try { 
            /* Form our AST */ 
        	 MyLexer lexer = new MyLexer (new PushbackReader( 
               new FileReader(args[0]), 1024));
//        	 while(!lexer.peek().getText().equals("")){ 
//        		 System.out.println(lexer.peek().getClass()); 
//        	     lexer.next(); 
//        	} //Bugado, Consertar.
        	 
        	 
        	 // Ainda bugado
        	
        	 while (true) {
             	Token t = lexer.next();
     		 String newline = t.toString();
             	String identificado = t.getClass().toString().replaceAll("class node\\.T?", "");
             	if(!identificado.equals("EOF")){
             		if (newline.contains("\n"))
             			System.out.println(identificado);
             		else
             			System.out.print(identificado + " ");
             	}		
             	if(t.getText().isEmpty()){
             		System.out.println("\n");
             		break;
             	}
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