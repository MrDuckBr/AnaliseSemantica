// Generated from Teste.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TesteParser}.
 */
public interface TesteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link TesteParser#tLinha}.
	 * @param ctx the parse tree
	 */
	void enterFimLinha(TesteParser.FimLinhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link TesteParser#tLinha}.
	 * @param ctx the parse tree
	 */
	void exitFimLinha(TesteParser.FimLinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link TesteParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterNLinha(TesteParser.NLinhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link TesteParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitNLinha(TesteParser.NLinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link TesteParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(TesteParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link TesteParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(TesteParser.NOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link TesteParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(TesteParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link TesteParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(TesteParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nTipos}
	 * labeled alternative in {@link TesteParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterNTipos(TesteParser.NTiposContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nTipos}
	 * labeled alternative in {@link TesteParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitNTipos(TesteParser.NTiposContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link TesteParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(TesteParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link TesteParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(TesteParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link TesteParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterNOperadores(TesteParser.NOperadoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link TesteParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitNOperadores(TesteParser.NOperadoresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nImpressao}
	 * labeled alternative in {@link TesteParser#impressao}.
	 * @param ctx the parse tree
	 */
	void enterNImpressao(TesteParser.NImpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nImpressao}
	 * labeled alternative in {@link TesteParser#impressao}.
	 * @param ctx the parse tree
	 */
	void exitNImpressao(TesteParser.NImpressaoContext ctx);
}