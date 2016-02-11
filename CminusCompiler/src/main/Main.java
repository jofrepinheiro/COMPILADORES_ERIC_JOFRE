package main;


import java.io.FileReader;
import java.io.PrintWriter;
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

				String tokenOutput = "";
				while (true) {
					Token t = lexer.next();
					String newline = t.toString();
					String token = t.getClass().toString().replaceAll("class node\\.T?", "").replace("class cminus.node.","");
					if(!token.equals("EOF")){
						if (newline.contains("\n"))
							tokenOutput+="["+token+"]\n";
						else
							tokenOutput+='['+token+']' + " ";
					}		
					if(t.getText().isEmpty()){
						tokenOutput+=("\n\n");
						break;
					}
				}
				//Interpreter Test, TBD
				//            Parser parser = new Parser(lexer); 
				//            Start ast = parser.parse() ; 
				//            	
				//            /* Get our Interpreter going. */ 
				//            Interpreter interp = new Interpreter () ; 
				//            ast.apply(interp) ;
				
				//Write to Tokens File
				try(PrintWriter tokenFile = new PrintWriter("testes/TokenOutput.txt")) {
					tokenFile.println(tokenOutput);
					tokenFile.close();
					System.out.println("Finished. Check your tokens file.");
				} catch (Exception e) {
					System.out.println("File not Found");
				}
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