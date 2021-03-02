package com.bit.file;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/ex02.bit")
public class Ex02Controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파일명 중복처리
		com.oreilly.servlet.multipart.FileRenamePolicy frp;
		frp=new com.oreilly.servlet.multipart.DefaultFileRenamePolicy();
		
		// 업로드 파일 사이즈 지정
		// 1 byte
		// 1kb == 1024byte
		// 1mb == 1024kb == 1024*1024 byte
		
		int maxSize=10*1024*1024;
		
		// 파일 업로드 디렉토리 지정
		String path=req.getRealPath("/upload");
		System.out.println(path);
		
		com.oreilly.servlet.MultipartRequest mr;
		mr=new MultipartRequest(req, path,maxSize,"utf-8",frp);
		
		
		String id=mr.getParameter("id");
		System.out.println("id:"+id);
		String origin=mr.getOriginalFileName("file01");
		String filename=mr.getFilesystemName("file01");
		System.out.println("filename:"+origin+"-"+filename);
		
		req.setAttribute("origin", origin );
		req.setAttribute("rename", filename);
		
		RequestDispatcher rd;
		rd=req.getRequestDispatcher("down01.jsp");
		rd.forward(req, resp);
	}
}




