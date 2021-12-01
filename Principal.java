import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        TesteParser parser = getParser("C:\\Users\\PatoG\\OneDrive\\Área de Trabalho\\Compiladores\\codigo.txt");
       // TesteParser parser = getParser("codigo.txt");

        //obter arvore
        ParseTree ast = parser.tLinha();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        AnalisadorSemantico listener = new AnalisadorSemantico();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getMapVariaveis().toString());
    }


    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static TesteParser getParser(String fileName){
        TesteParser parser = null;
        try{
            CharStream input =  CharStreams.fromFileName(fileName);
            TesteLexer lexer = new TesteLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new TesteParser(tokens);



        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}

