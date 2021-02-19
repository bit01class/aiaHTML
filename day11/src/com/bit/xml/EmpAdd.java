package com.bit.xml;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpAdd extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Enumeration<String> enu = req.getParameterNames();
		while(enu.hasMoreElements()) {
			String name=enu.nextElement();
			System.out.println(name+":"+req.getParameter(name));
		}
	}
}










