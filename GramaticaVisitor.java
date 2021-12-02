// Generated from Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link GramaticaParser#tLinha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFimLinha(GramaticaParser.FimLinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link GramaticaParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNLinha(GramaticaParser.NLinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link GramaticaParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperacao(GramaticaParser.NOperacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracao(GramaticaParser.NDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link GramaticaParser#operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperadores(GramaticaParser.NOperadoresContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nImpressao}
	 * labeled alternative in {@link GramaticaParser#impressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNImpressao(GramaticaParser.NImpressaoContext ctx);
}