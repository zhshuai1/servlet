package com.zebrait;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Hello extends HttpServlet {
	
	private int id=0;
	private static int id2=0;
	
	public void init() throws ServletException {
		super.init();
		System.out.println("Here is init...");
	};

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("here is doGet...");
		System.out.println("this is member id:"+id++);
		System.out.println("This is static id:"+id2++);
		PrintWriter printWriter= resp.getWriter();
		printWriter.println("Hello world!"+ req.getParameter("name"));
		printWriter.println("Hello world!"+ req.getParameter("name"));
		printWriter.println("Hello world!"+ req.getParameter("name"));
		printWriter.println("Hello world!"+ req.getParameter("name"));
		printWriter.println(req.getParameterValues("name")[1]);
		printWriter.println("bye3");
		Enumeration<String> strings=req.getHeaderNames();
		while(strings.hasMoreElements()){
			printWriter.println(strings.nextElement());
		}
		Cookie [] cookies=req.getCookies();
		boolean isExist=false;
		for(int i=0;cookies!=null&&i<cookies.length;++i) {
			if(cookies[i].getName().equals("hello-cookie")){
				printWriter.write("<h1>"+cookies[i]+"</h1>");
				isExist=true;
				break;
			}
		}
		if(!isExist){
			Cookie cookie=new Cookie("hello-cookie", "world");
			cookie.setMaxAge(60);
			resp.addCookie(cookie);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	protected long getLastModified(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return super.getLastModified(req);
	}
	
	


}
