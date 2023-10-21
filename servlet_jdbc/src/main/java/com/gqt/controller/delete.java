package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.servletjdbc.beans.Library;
import com.gqt.servletjdbc.model.Model;

public class delete extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int bookid = Integer.parseInt(request.getParameter("bookid"));
				
		Library l = new Library();
		l.setBookid(bookid);
		
		Model m=new Model();
		boolean b=m.deleteData(l);
		if(b==true) {
			response.sendRedirect("/Jdbccrud/deletesuccess.html");
		}else {
			response.sendRedirect("/Jdbccrud/deletefail.html");
	
		}
	}
}