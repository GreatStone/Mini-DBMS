// Generated from D:\CodeWork\DBMS\sql.g4 by ANTLR 4.1
package DBMS.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sqlParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(@NotNull sqlParser.ValContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_insert(@NotNull sqlParser.Sql_insertContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_use(@NotNull sqlParser.Sql_useContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_select(@NotNull sqlParser.Sql_selectContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#type_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(@NotNull sqlParser.Type_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull sqlParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#type_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_string(@NotNull sqlParser.Type_stringContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#subval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubval(@NotNull sqlParser.SubvalContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#bool_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_val(@NotNull sqlParser.Bool_valContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull sqlParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_update(@NotNull sqlParser.Sql_updateContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(@NotNull sqlParser.TypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sub_bool_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_bool_val(@NotNull sqlParser.Sub_bool_valContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#type_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_double(@NotNull sqlParser.Type_doubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull sqlParser.Database_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_drop_database(@NotNull sqlParser.Sql_drop_databaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(@NotNull sqlParser.OpContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_create_database(@NotNull sqlParser.Sql_create_databaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_op(@NotNull sqlParser.Bool_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(@NotNull sqlParser.ConstsContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull sqlParser.CompareContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_create_table(@NotNull sqlParser.Sql_create_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(@NotNull sqlParser.TablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#colomn_alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColomn_alias_name(@NotNull sqlParser.Colomn_alias_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#colomns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColomns(@NotNull sqlParser.ColomnsContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sqls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqls(@NotNull sqlParser.SqlsContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#table_alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias_name(@NotNull sqlParser.Table_alias_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull sqlParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#select_or_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_set(@NotNull sqlParser.Select_or_setContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_drop_table(@NotNull sqlParser.Sql_drop_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#colomn_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColomn_name(@NotNull sqlParser.Colomn_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link sqlParser#sql_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_delete(@NotNull sqlParser.Sql_deleteContext ctx);
}