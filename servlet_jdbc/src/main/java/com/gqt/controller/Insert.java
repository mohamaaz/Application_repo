package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.servletjdbc.beans.Library;
import com.gqt.servletjdbc.model.Model;

public class Insert extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		int yr_publish = Integer.parseInt(request.getParameter("yr_publish"));
		int cost = Integer.parseInt(request.getParameter("cost"));
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String lib_location = request.getParameter("lib_location");
		
		Library l = new Library();
		l.setBookid(bookid);
		l.setBookname(bookname);
		l.setAuthor(author);
		l.setYr_publish(yr_publish);
		l.setCost(cost);
		l.setLib_location(lib_location);
		
		Model m = new Model();
		boolean b = m.insertData(l);
		if(b==true) {
			response.sendRedirect("/Jdbccrud/insertsuccess.html");
		}
		else {
			response.sendRedirect("/Jdbccrud/insertfail.html");
		}	
	}
}