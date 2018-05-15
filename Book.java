package com.app.model;

public class Book {
private String bookName;
private String bookAuthor;
private long bookNumber;
private int bookPrice;
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public long getBookNumber() {
	return bookNumber;
}
public void setBookNumber(long bookNumber) {
	this.bookNumber = bookNumber;
}

public int getBookPrice() {
	return bookPrice;
}
public void setBookPrice(int bookPrice) {
	this.bookPrice = bookPrice;
}
@Override
public String toString() {
	return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor
			+ ", bookNumber=" + bookNumber + ", bookPrice=" + bookPrice + "]";
}
}
