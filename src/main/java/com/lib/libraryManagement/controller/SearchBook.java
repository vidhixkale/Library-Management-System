package com.lib.libraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lib.libraryManagement.entity.Book;
import com.lib.libraryManagement.repo.BookRepo;
import com.lib.libraryManagement.service.FindBook;

@Controller
public class SearchBook {
    
    @Autowired
    public BookRepo bookRepo;

    @Autowired
    public FindBook bookToFind;

    @GetMapping("/searchBook")
    public String searchBook(){
        return "searchBook";
    }

    @PostMapping("/Searched")
    public String bookFound(@RequestParam("bookName") String BookName,Model model){

        Book bookToBeSearched=bookToFind.findBookIdbyBookName(BookName);
        java.util.List<Book> books=new java.util.ArrayList<Book>();
        books.add(bookToBeSearched);


        model.addAttribute("books", books);

        return "DisplaySearch";
    }
}
