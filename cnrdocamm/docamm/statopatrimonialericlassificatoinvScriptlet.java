import net.sf.jasperreports.engine.*;


public class statopatrimonialericlassificatoinvScriptlet extends it.businesslogic.ireport.IReportScriptlet {
private java.lang.String id_report;    
/** Creates a new instance of JRIreportDefaultScriptlet */
public statopatrimonialericlassificatoinvScriptlet() {
	
	
}








/** Begin EVENT_AFTER_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */
public void afterColumnInit() throws JRScriptletException
{
	super.beforeColumnInit();
}
/** End EVENT_AFTER_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_AFTER_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */
public void afterDetailEval() throws JRScriptletException
{
	setVariableValue("id_rep",id_report);	
	super.afterDetailEval();
}
/** End EVENT_AFTER_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_AFTER_GROUP_INIT This line is generated by iReport. Don't modify or move please! */
public void afterGroupInit(String groupName) throws JRScriptletException
{
	super.afterGroupInit(groupName);
}
/** End EVENT_AFTER_GROUP_INIT This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_AFTER_PAGE_INIT This line is generated by iReport. Don't modify or move please! */
public void afterPageInit() throws JRScriptletException
{
	super.afterPageInit();
}
/** End EVENT_AFTER_PAGE_INIT This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_AFTER_REPORT_INIT This line is generated by iReport. Don't modify or move please! */
public void afterReportInit() throws JRScriptletException
{
	
}
/** End EVENT_AFTER_REPORT_INIT This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_BEFORE_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */
public void beforeColumnInit() throws JRScriptletException
{
		
}
/** End EVENT_BEFORE_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_BEFORE_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */
public void beforeDetailEval() throws JRScriptletException
{
	
}
/** end EVENT_BEFORE_DETAIL_EVAL Please don't touch or move this comment*/

/** End EVENT_BEFORE_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_BEFORE_GROUP_INIT This line is generated by iReport. Don't modify or move please! */
public void beforeGroupInit(String groupName) throws JRScriptletException
{
	
}
/** End EVENT_BEFORE_GROUP_INIT This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_BEFORE_PAGE_INIT This line is generated by iReport. Don't modify or move please! */
public void beforePageInit() throws JRScriptletException
{
	
}
/** End EVENT_BEFORE_PAGE_INIT This line is generated by iReport. Don't modify or move please! */
/** Begin EVENT_BEFORE_REPORT_INIT This line is generated by iReport. Don't modify or move please! */
public void beforeReportInit() throws JRScriptletException
{
	java.sql.Connection conn = (java.sql.Connection)getParameterValue(JRParameter.REPORT_CONNECTION);
	java.sql.CallableStatement cs = null; 
	try{
        	conn.setAutoCommit(false);
		cs = conn.prepareCall("{ ? = call func_PRT_S_SP_RICLASSIFICATO(?,?,?,?,?)}");
		cs.registerOutParameter(1,java.sql.Types.VARCHAR);
		cs.setObject(2, (java.lang.String)getParameterValue("ATTPAS"));
		cs.setObject(3, (java.lang.String)getParameterValue("IST_COMM"));
		cs.setObject(4,(java.lang.Integer)getParameterValue("inEs"));
		cs.setObject(5,(java.lang.String)getParameterValue("CDS"));
		cs.setObject(6,(java.lang.String)getParameterValue("uo"));	
		cs.executeQuery();
		id_report = (java.lang.String)cs.getObject(1);
	}catch (Throwable e) {
		throw new JRScriptletException(e.getMessage());
	} finally {
		if (cs != null) 
			try {
				cs.close();
			} catch (java.sql.SQLException e1) {
				throw new JRScriptletException(e1.getMessage());
			}
	}	
}
/** End EVENT_BEFORE_REPORT_INIT This line is generated by iReport. Don't modify or move please! */

}