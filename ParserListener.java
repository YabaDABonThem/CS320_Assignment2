// Generated from Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(ParserParser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(ParserParser.ClazzContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ParserParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ParserParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ParserParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ParserParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParserParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParserParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ParserParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ParserParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ParserParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ParserParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ParserParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ParserParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(ParserParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(ParserParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(ParserParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(ParserParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(ParserParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(ParserParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(ParserParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(ParserParser.IfstmtContext ctx);
}