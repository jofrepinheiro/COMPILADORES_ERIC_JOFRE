package main;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackReader;

import cminus.lexer.Lexer;
import cminus.lexer.LexerException;
import cminus.node.PProgram;
import cminus.node.Start;
import cminus.node.Token;
import cminus.parser.Parser;

public class Main {
	public static void main(String[] args) throws Exception {
		if (args.length > 0) {
				/* Form our AST */
				MyLexer lexer = new MyLexer(new PushbackReader(new FileReader(args[0]), 1024));
				printTokens(lexer);
				Parser parser = new Parser(lexer);
				Start start = parser.parse();
		} else {
			System.err.println("usage: java cminus inputFile");
			System.exit(1);
		}
	}

	public static void printTokens(Lexer lexer) {
		String tokenOutput = "";
		while (true) {
			Token t;
			try {
				t = lexer.next();

				String newline = t.toString();
				String token = t.getClass().toString().replaceAll("class node\\.T?", "").replace("class cminus.node.",
						"");
				if (!token.equals("EOF")) {
					if (newline.contains("\n"))
						tokenOutput += "[" + token + "]\n";
					else
						tokenOutput += '[' + token + ']' + " ";
				}
				if (t.getText().isEmpty()) {
					tokenOutput += ("\n\n");
					break;
				}
			} catch (LexerException | IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

		// Write to Tokens File
		try (PrintWriter tokenFile = new PrintWriter("testes/TokenOutput.txt")) {
			tokenFile.println(tokenOutput);
			tokenFile.close();
			System.out.println("Finished. Check your tokens file.");
		} catch (Exception e) {
			System.out.println("File not Found");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}