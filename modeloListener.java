// Generated from modelo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link modeloParser}.
 */
public interface modeloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link modeloParser#tLinha}.
	 * @param ctx the parse tree
	 */
	void enterFimLinha(modeloParser.FimLinhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link modeloParser#tLinha}.
	 * @param ctx the parse tree
	 */
	void exitFimLinha(modeloParser.FimLinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link modeloParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterNLinha(modeloParser.NLinhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link modeloParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitNLinha(modeloParser.NLinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link modeloParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(modeloParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link modeloParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(modeloParser.NOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link modeloParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(modeloParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link modeloParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(modeloParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nTipos}
	 * labeled alternative in {@link modeloParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterNTipos(modeloParser.NTiposContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nTipos}
	 * labeled alternative in {@link modeloParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitNTipos(modeloParser.NTiposContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link modeloParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(modeloParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link modeloParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(modeloParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link modeloParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterNOperadores(modeloParser.NOperadoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link modeloParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitNOperadores(modeloParser.NOperadoresContext ctx);
}