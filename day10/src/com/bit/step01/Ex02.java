package com.bit.step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class Ex02 implements Servlet{
	ServletConfig config;

	public void destroy() {}
	public ServletConfig getServletConfig() {return config;}
	public String getServletInfo() {return "";}
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}

	public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

}
