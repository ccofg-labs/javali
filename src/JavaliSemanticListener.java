import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class JavaliSemanticListener extends JavaliBaseListener {
    private ParseTreeProperty<Object> values = new ParseTreeProperty<>();

    @Override
    public void exitIntegerDeclationStatement(JavaliParser.IntegerDeclationStatementContext ctx) {
        String variableName = ctx.ID().getText();
        int value = (int) values.get(ctx.integerExpression());
        // Lógica para lidar com a declaração de variáveis inteiras
        System.out.println("Integer Variable Declaration: " + variableName + " = " + value);
        // Armazenar o valor da variável na memória
        values.put(ctx, value);
    }


    public void exitFloatDeclarationStatement(JavaliParser.FloatDeclarationStatementContext ctx) {
        String variableName = ctx.ID().getText();
        float value = (float) values.get(ctx.floatExpression());
        // Lógica para lidar com a declaração de variáveis reais
        System.out.println("Float Variable Declaration: " + variableName + " = " + value);
        // Armazenar o valor da variável na memória
        values.put(ctx, value);
    }

    @Override
    public void exitBooleanDeclarationStatement(JavaliParser.BooleanDeclarationStatementContext ctx) {
        String variableName = ctx.ID().getText();
        boolean value = (boolean) values.get(ctx.booleanExpression());
        // Lógica para lidar com a declaração de variáveis booleanas
        System.out.println("Boolean Variable Declaration: " + variableName + " = " + value);
        // Armazenar o valor da variável na memória
        values.put(ctx, value);
    }

    @Override
    public void exitIntegerExpression(JavaliParser.IntegerExpressionContext ctx) {
        if (ctx.NUMBER() != null) {
            values.put(ctx, Integer.parseInt(ctx.NUMBER().getText()));
        } else if (ctx.ID() != null) {
            values.put(ctx, values.get(ctx.ID()));
        } else {
            int left = (int) values.get(ctx.integerExpression(0));
            int right = (int) values.get(ctx.integerExpression(1));
            String operator = ctx.getChild(1).getText();

            // Lógica para operações aritméticas
            switch (operator) {
                case "+":
                    values.put(ctx, left + right);
                    break;
                case "-":
                    values.put(ctx, left - right);
                    break;
                case "*":
                    values.put(ctx, left * right);
                    break;
                case "/":
                    values.put(ctx, left / right);
                    break;
                // Adicione mais casos conforme necessário
            }
        }
    }

    // Adicione métodos semelhantes para manipulação de variáveis reais e booleanas

    // Método para obter o valor de uma variável
    public Object getVariableValue(String variableName) {
        return values.get(getVariableContext(variableName));
    }

    // Método auxiliar para obter o contexto da variável
    private ParseTree getVariableContext(String variableName) {
        // Lógica para encontrar o contexto da variável pelo nome
        // Pode variar dependendo da sua implementação da gramática
        // Este é apenas um exemplo simplificado
        return null;
    }
}
