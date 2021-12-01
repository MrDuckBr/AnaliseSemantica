// Generated from Teste.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TesteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TesteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link TesteParser#tLinha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFimLinha(TesteParser.FimLinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link TesteParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNLinha(TesteParser.NLinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link TesteParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperacao(TesteParser.NOperacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link TesteParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(TesteParser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nTipos}
	 * labeled alternative in {@link TesteParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTipos(TesteParser.NTiposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link TesteParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracao(TesteParser.NDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link TesteParser#operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperadores(TesteParser.NOperadoresContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nImpressao}
	 * labeled alternative in {@link TesteParser#impressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNImpressao(TesteParser.NImpressaoContext ctx);
}