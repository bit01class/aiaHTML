package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex08 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// xml service
		System.out.println("call xml...");
		resp.setContentType("application/xml;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<students>");
		
		out.println("<student>");
		out.println("<num>"+1+"</num>");
		out.println("<name>"+"user1"+"</name>");
		out.println("<kor>"+91+"</kor>");
		out.println("<eng>"+90+"</eng>");
		out.println("<math>"+93+"</math>");
		out.println("</student>");

		out.println("<student>");
		out.println("<num>"+2+"</num>");
		out.println("<name>"+"user2"+"</name>");
		out.println("<kor>"+81+"</kor>");
		out.println("<eng>"+80+"</eng>");
		out.println("<math>"+98+"</math>");
		out.println("</student>");

		out.println("<student>");
		out.println("<num>"+3+"</num>");
		out.println("<name>"+"user3"+"</name>");
		out.println("<kor>"+71+"</kor>");
		out.println("<eng>"+90+"</eng>");
		out.println("<math>"+73+"</math>");
		out.println("</student>");

		out.println("<student>");
		out.println("<num>"+4+"</num>");
		out.println("<name>"+"user4"+"</name>");
		out.println("<kor>"+91+"</kor>");
		out.println("<eng>"+88+"</eng>");
		out.println("<math>"+77+"</math>");
		out.println("</student>");
		
		out.println("</students>");
	}
}











