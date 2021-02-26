package com.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.bit")
public class LoginController extends HttpServlet {
	Logger log=Logger.getGlobal();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		log.info("param : id="+id+",pw="+pw);
		
		// dao
		
		HttpSession session = req.getSession();
		session.setAttribute("loginResult", true);
		session.setAttribute("loginID", id);
		
		String json="{\"login\":[{\"loginResult\":true,\"loginID\":\""+id+"\"}]}";
		log.info(json);
		
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		out.println(json);
	}
}








