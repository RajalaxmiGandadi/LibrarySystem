package com.app.model;

import java.sql.Timestamp;
import java.util.List;

@Entity 
@Table(name="Borrower")
@EntityListeners(AuditingEntityListener.class)
public class Borrower {

@Column(name="borrowerFname")
private String borrowerFname;


@Column(name="borrowerLname")
private String borrowerLname;


@Column(name="booksName")
private List<String> booksName;
		

@Column(name="issueDate")
private Timestamp issueDate;
		

@Column(name="returnDate")
private Timestamp returnDate;

@Id
@Column(name="booknumber")
private long booknumber;
		

@Column(name="bookCount")
private int bookCount;
public String getBorrowerFname() {
	return borrowerFname;
}
public void setBorrowerFname(String borrowerFname) {
	this.borrowerFname = borrowerFname;
}
public String getBorrowerLname() {
	return borrowerLname;
}
public void setBorrowerLname(String borrowerLname) {
	this.borrowerLname = borrowerLname;
}
public List<String> getBooksName() {
	return booksName;
}
public void setBooksName(List<String> booksName) {
	this.booksName = booksName;
}
public Timestamp getIssueDate() {
	return issueDate;
}
public void setIssueDate(Timestamp issueDate) {
	this.issueDate = issueDate;
}
public Timestamp getReturnDate() {
	return returnDate;
}
public void setReturnDate(Timestamp returnDate) {
	this.returnDate = returnDate;
}
public long getBooknumber() {
	return booknumber;
}
public void setBooknumber(long booknumber) {
	this.booknumber = booknumber;
}
public int getBookCount() {
	return bookCount;
}
public void setBookCount(int bookCount) {
	this.bookCount = bookCount;
}
@Override
public String toString() {
	return "Borrower [borrowerFname=" + borrowerFname + ", borrowerLname="
			+ borrowerLname + ", booksName=" + booksName + ", issueDate="
			+ issueDate + ", returnDate=" + returnDate + ", booknumber="
			+ booknumber + ", bookCount=" + bookCount + "]";
}
}
