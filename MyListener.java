import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Executable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends GramaticaBaseListener {

  private Map<String,String> tabelaSimbolos = new HashMap<String,String>();


    @Override
    public void exitNDeclaracao(GramaticaParser.NDeclaracaoContext ctx) {
        String tipo = ctx.Tipos().getText();
           String id = ctx.Variavel().getText();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
    }

    @Override
    public void exitNImpressao(GramaticaParser.NImpressaoContext ctx) {
        String variavel  = ctx.Variavel().getText();

        if(!tabelaSimbolos.containsKey(variavel)){
            System.out.println("Operação ilegal: " + variavel + " não existe");
        }
    }

    @Override
    public void exitNAtribuicao(GramaticaParser.NAtribuicaoContext ctx) {
       try {
           List<TerminalNode> variaveis = ctx.Variavel();
           String tipo = tabelaSimbolos.get(variaveis.get(0).getText());
           int contador = 0;
           for (TerminalNode var : variaveis) {
               if (tipo.equals(tabelaSimbolos.get(var.getText()))) {
                   contador++;
               }
               if (!tabelaSimbolos.containsKey(var.getText())) {
                   System.out.println("Sem Declaração! Variável " + var + " não declarada");
               }
           }
           //Checagem de Tipos
           if (contador != variaveis.size()) System.out.println("Tipo das variaveis Diferentes");
           else System.out.println("Tipos das Variaveis iguais, operacao permitida");
       }catch (Exception e){
           System.out.println("Variavél não declarada");
       }
    }

    @Override
    public void exitNOperacao(GramaticaParser.NOperacaoContext ctx) {
        try {
            List<TerminalNode> variaveis = ctx.Variavel();

            for (TerminalNode var:variaveis) {
                if (!tabelaSimbolos.containsKey(var.getText())){
                    System.out.println("Sem Declaração! Variável " + var + " não declarada");
                }
            }
        }catch (Exception e){}
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
