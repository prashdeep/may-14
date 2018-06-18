package com.edureka.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetServletDemo extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String keyword = request.getParameter("keyword");
		String result = null;
		switch (keyword) {
		case "NewYork":
			result = "U.S.A";
			break;
		case "Bangalore":
			result =  "India";
			break;
		case "Sydney":
			result = "Australia";
			break;
		default:
			break;
		}
		
		PrintWriter out = response.getWriter();
		out.write("<h1>Hi There from  !!"+ result+"</h1> ");
		out.flush();
	}
	

}
