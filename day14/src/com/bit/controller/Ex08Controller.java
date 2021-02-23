package com.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex08Controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
//		resp.setContentType("application/json");
		resp.setHeader("content-Type", "application/json");
		PrintWriter out = resp.getWriter();
		out.print("{\"root\":[{\"key\":\"val\"}]}");
//		out.println("<h1>abcdefg</h1>");
//		resp.sendError(HttpServletResponse.SC_NOT_FOUND);
	}

}








