package com.bit.dept.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dept.model.DeptDao;

public class DeptList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeptDao dao=new DeptDao();
		req.setAttribute("list", dao.selectAll());
		
		RequestDispatcher rd;
		rd=req.getRequestDispatcher("/list.jsp");
		rd.forward(req, resp);
	}
}












