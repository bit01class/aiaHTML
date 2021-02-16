<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,java.util.*"%>
<%
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";
String sql="select * from dept";

Connection conn=null;
PreparedStatement pstmt=null;
ResultSet rs=null;
boolean boo=true;
try{
	Class.forName(driver);
	conn=DriverManager.getConnection(url, user, password);
	pstmt=conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
		out.print("{\"dept\":[");
	while(rs.next()){
		if(boo){
			boo=false;
		}else{
			out.print(",");
		}
		out.print("{\"deptno\":"+rs.getInt(1));
		out.print(",\"dname\":\""+rs.getString(2));
		out.print("\",\"loc\":\""+rs.getString(3));
		out.print("\"}");
	}
		out.print("]}");
}finally{
	if(conn!=null)conn.close();
}
%>







