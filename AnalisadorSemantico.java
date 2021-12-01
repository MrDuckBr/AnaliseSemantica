import java.util.HashMap;
import java.util.Map;

public class AnalisadorSemantico extends TesteBaseListener {
/*
    #fimLinha
    #nLinha
    #nOperacao
    #nAtribuicao
    #nTipos
    #nDeclaracao
    #nOperadores
    #nImpressao

 */

    Map<String,String> mapVariaveis = new HashMap<>();

    @Override
    public void enterNDeclaracao(TesteParser.NDeclaracaoContext ctx) {
        String declaracao = ctx.getText();
        String tipo = ctx.tipos().getText();

        if(!mapVariaveis.containsKey(declaracao)){
            mapVariaveis.put(declaracao,tipo);
        }else{
            System.out.println("Variavel Já criada");
        }

    }

    @Override
    public void enterNOperacao(TesteParser.NOperacaoContext ctx) {

    }

    @Override
    public void exitNLinha(TesteParser.NLinhaContext ctx) {
        System.out.println(ctx.getText());
    }


    public Map<String, String> getMapVariaveis(){
        return mapVariaveis;
    }
}
