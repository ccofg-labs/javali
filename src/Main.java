import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream charStream = CharStreams.fromFileName("./src/tests/variaveis/real.javc");
            JavaliLexer lexer = new JavaliLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaliParser parser = new JavaliParser(tokens);
            ParseTree parseTree = parser.prog();

            System.out.println(parseTree.toString());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
