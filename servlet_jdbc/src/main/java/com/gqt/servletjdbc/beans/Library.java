package com.gqt.servletjdbc.beans;

public class Library {
	
	 int bookid;
	  String bookname;
	  String author;
	  int yr_publish;
	  int cost;
	  String lib_location;
	public int getBookid() {
		return bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public String getAuthor() {
		return author;
	}
	public int getYr_publish() {
		return yr_publish;
	}
	public int getCost() {
		return cost;
	}
	public String getLib_location() {
		return lib_location;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYr_publish(int yr_publish) {
		this.yr_publish = yr_publish;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setLib_location(String lib_location) {
		this.lib_location = lib_location;
	}
	}
