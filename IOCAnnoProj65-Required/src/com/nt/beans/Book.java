package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Book {
	private int bookId;
	private  String bookName;
	private  String author;
	
	@Required
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Required
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	

}
