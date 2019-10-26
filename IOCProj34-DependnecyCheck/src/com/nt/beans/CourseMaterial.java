package com.nt.beans;

public class CourseMaterial {
	private  String  bookName;
	private  int  pagesCount;
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}
	@Override
	public String toString() {
		return "CourseMaterial [bookName=" + bookName + ", pagesCount=" + pagesCount + "]";
	}
	
	

}
