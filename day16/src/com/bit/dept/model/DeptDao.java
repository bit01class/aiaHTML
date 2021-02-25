package com.bit.dept.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DeptDao {
	Logger log=Logger.getGlobal();
	// 
	javax.sql.DataSource dataSource;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	/*
	<Resource
	name="jdbc/maria"
	type="javax.sql.DataSource"
	driverClassName="org.mariadb.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/xe"
	username="scott" password="tiger"
    minIdle="2" maxIdle="10" maxActive="5" maxWait="-1"
	/>
	*/
	
	public DeptDao() {
		try {
//			InitialContext initCon = new InitialContext();
//			javax.naming.Context context = null;
//			context=(Context) initCon.lookup("java:/comp/env");
//			
//			dataSource=(DataSource) context.lookup("jdbc/maria");

			InitialContext initCon = new InitialContext();
			dataSource=(DataSource) initCon.lookup(
								"java:/comp/env/jdbc/maria");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public List<DeptDto> selectAll() throws SQLException{
		String sql="select * from dept";
		List<DeptDto> list=new ArrayList<DeptDto>();
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				DeptDto bean=new DeptDto();
				bean.setDeptno(rs.getInt("deptno"));
				bean.setDname(rs.getString("dname"));
				bean.setLoc(rs.getString("loc"));
				log.setLevel(Level.INFO);
				log.severe("심각");
				log.warning("경고");
				log.info("정보");
				log.config("config");
				log.fine("fine");
				log.finer("finer");
				log.finest("finest");
				list.add(bean);
			}
		} finally {
			if(conn!=null)conn.close();
		}
		return list;
	}
}









