package com.bit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsonpService extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String callback=req.getParameter("callback");
		PrintWriter out = resp.getWriter();
//		out.println(callback+"({\"key1\":\"val1\"})");
		
		URL url=new URL("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109");
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String msg=null;
		while((msg=br.readLine())!=null)
			out.println(msg);
		is.close();
	}
}











