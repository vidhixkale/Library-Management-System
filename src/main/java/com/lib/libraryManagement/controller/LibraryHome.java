package com.lib.libraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lib.libraryManagement.entity.Book;
import com.lib.libraryManagement.repo.BookRepo;


@Controller
public class LibraryHome {

    @Autowired
    public BookRepo bookrepo;
    
    @GetMapping("/")
    public String HomePage(){
        return "home";
    }

    @GetMapping("/addbook")
    public String addBook(){
        return "addBooks";
    }

   


    @PostMapping("/added")
    public String BookAdded(@ModelAttribute Book book,org.springframework.ui.Model model){
        System.out.println(book.toString());
		// validate 
		System.out.println(book.getBookName());
		System.out.println(book.getAuthorName());
		System.out.println(book.getBookid());
		System.out.println(book.getIssueDate());
		System.out.println(book.getReturnDate());
		model.addAttribute("BookName", book.getBookName());
		model.addAttribute("BookID", book.getBookid());

        bookrepo.save(book);

        model.addAttribute("Message",book.getBookid()+" : "+book.getBookName()+" inserted successfully");

        return "added";
    }



}
