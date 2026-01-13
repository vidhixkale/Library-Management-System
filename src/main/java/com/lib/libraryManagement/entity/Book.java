package com.lib.libraryManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long bookid;

    @Column(name = "BookName")
    public String BookName;

    @Column(name = "AuthorName")
    public String AuthorName;

    @Column(name = "IssueDate")
    public String IssueDate;

    @Column(name = "RetrunDate")
    public String ReturnDate;

    @Override
    public String toString() {
        return "Book [bookid=" + bookid + ", BookName=" + BookName + ", AuthorName=" + AuthorName + ", IssueDate="
                + IssueDate + ", ReturnDate=" + ReturnDate + "]";
    }

    public Book() {
    }

  

    public Book(Long bookid, String bookName, String authorName, String issueDate, String returnDate) {
        this.bookid = bookid;
        BookName = bookName;
        AuthorName = authorName;
        IssueDate = issueDate;
        ReturnDate = returnDate;
    }

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String issueDate) {
        IssueDate = issueDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String returnDate) {
        ReturnDate = returnDate;
    }
}
