// Generated from Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link GramaticaParser#tLinha}.
	 * @param ctx the parse tree
	 */
	void enterFimLinha(GramaticaParser.FimLinhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link GramaticaParser#tLinha}.
	 * @param ctx the parse tree
	 */
	void exitFimLinha(GramaticaParser.FimLinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link GramaticaParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterNLinha(GramaticaParser.NLinhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link GramaticaParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitNLinha(GramaticaParser.NLinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link GramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(GramaticaParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link GramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(GramaticaParser.NOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(GramaticaParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(GramaticaParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link GramaticaParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterNOperadores(GramaticaParser.NOperadoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link GramaticaParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitNOperadores(GramaticaParser.NOperadoresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nImpressao}
	 * labeled alternative in {@link GramaticaParser#impressao}.
	 * @param ctx the parse tree
	 */
	void enterNImpressao(GramaticaParser.NImpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nImpressao}
	 * labeled alternative in {@link GramaticaParser#impressao}.
	 * @param ctx the parse tree
	 */
	void exitNImpressao(GramaticaParser.NImpressaoContext ctx);
}