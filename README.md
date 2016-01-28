# Compilador Cminus por Eric e Jofre

Ao rodar no Eclipse, adicionar o caminho para o arquivo de testes onde estará o programa a ser compilado em Run Configurations->Arguments->Program Arguments, em nosso caso "testes/teste.minus"

Alem disso, criar uma external tool para geração do código java pelo SableCC Baseado no arquivo da gramatica como explica esse <a src="http://web.archive.org/web/20090318023544/http://www.comp.nus.edu.sg/~sethhetu/rooms/Tutorials/EclipseAndSableCC.html">tutorial</a> ( http://web.archive.org/web/20090318023544/http://www.comp.nus.edu.sg/~sethhetu/rooms/Tutorials/EclipseAndSableCC.html ) na seção "Creating a SableCC Tool".

OBS.:
15) Anytime you change your grammar (in our case, simpleAdder.sable), you'll need to run your SableCC tool on it to re-generate the files for your parser/lexer/etc. 
16) If you're just changing the interpreter, you merely need to recompile the java code. This is one of the great strengths of SableCC. 
17) It is a Very Good Idea to clean (read: "delete") any files SableCC has generated before re-generating your grammar. Otherwise, you might get old (and probably incorrect) code conflicting with new (correct) code. 
