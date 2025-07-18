package com.elevateLabs;

public class Book {
	private String title;
	private String author;
	private boolean isIssued;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isIssued = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	
	public void issue() {
		isIssued = true;
	}
	
	public void returnBook() {
		isIssued = false;
	}

	@Override
	public String toString() {
		return "Book title=" + title + ", author=" + author + ", isIssued=" + isIssued ;
	}

}