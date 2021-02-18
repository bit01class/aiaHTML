package com.bit.step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01 implements Servlet {
	ServletConfig config;

	@Override
	public void destroy() {
		System.out.println("destroy()...");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()...");
		return config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()...");
		return "Info...";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("init()...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service()...");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>hello world</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}







