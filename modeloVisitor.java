// Generated from modelo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link modeloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface modeloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code fimLinha}
	 * labeled alternative in {@link modeloParser#tLinha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFimLinha(modeloParser.FimLinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nLinha}
	 * labeled alternative in {@link modeloParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNLinha(modeloParser.NLinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nOperacao}
	 * labeled alternative in {@link modeloParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperacao(modeloParser.NOperacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nAtribuicao}
	 * labeled alternative in {@link modeloParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(modeloParser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nTipos}
	 * labeled alternative in {@link modeloParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTipos(modeloParser.NTiposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nDeclaracao}
	 * labeled alternative in {@link modeloParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracao(modeloParser.NDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nOperadores}
	 * labeled alternative in {@link modeloParser#operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOperadores(modeloParser.NOperadoresContext ctx);
}