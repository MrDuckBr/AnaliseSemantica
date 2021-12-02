import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        GramaticaParser parser = getParser("C:\\Users\\PatoG\\OneDrive\\Área de Trabalho\\Compiladores\\codigo.txt");
       // TesteParser parser = getParser("codigo.txt");

        //obter arvore
        ParseTree ast = parser.tLinha();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }


    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static GramaticaParser getParser(String fileName){
        GramaticaParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GramaticaParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}


