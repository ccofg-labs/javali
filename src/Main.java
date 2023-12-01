import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream in = CharStreams.fromFileName("./src/tests/variaveis/real.javc");
        JavaliLexer lexer = new JavaliLexer((CharStream) in);
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
        JavaliParser parser = new JavaliParser((TokenStream) tokens);
        ParseTree parseTree = parser.prog();
        System.out.println(parseTree.toString());
    }

}
