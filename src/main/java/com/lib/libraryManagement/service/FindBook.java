package com.lib.libraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.libraryManagement.entity.Book;
import com.lib.libraryManagement.repo.BookRepo;

@Service
public class FindBook {
    
    @Autowired
    public BookRepo bookRepo;

    public Book findBookIdbyBookName(String targeString){

        List<Book> bookList=bookRepo.findAll();  
        for (Book bookToFind : bookList) {
            if(bookToFind.getBookName().equals(targeString)){
                return bookToFind;
            }
        }
        return null;
        
    } 
    /*public Long findBookIdbyBookName(String targeString){

        List<Book> bookList=bookRepo.findAll();  
        for (Book bookToFind : bookList) {
            if(bookToFind.getBookName().equals(targeString)){
                return bookToFind.getBookid();
            }
        }
        return null;
        
    }*/        
}
