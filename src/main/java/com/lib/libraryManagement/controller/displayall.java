package com.lib.libraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lib.libraryManagement.entity.Book;
import com.lib.libraryManagement.repo.BookRepo;

@Controller
public class displayall {
    
    @Autowired
    public BookRepo bookRepo;


    @GetMapping("/displayall")
    public String displayAll(Model model){
        java.util.List<Book> allbooks=bookRepo.findAll();
        model.addAttribute("AllBooks", allbooks);	
        return "displayAllBooks";
    }
    


}
