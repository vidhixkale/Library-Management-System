package com.lib.libraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lib.libraryManagement.entity.Book;
import com.lib.libraryManagement.repo.BookRepo;
import com.lib.libraryManagement.service.FindBook;

@Controller
public class remove {

    @Autowired
    public BookRepo bookRepo;

    @Autowired
    public FindBook fbook;

     @GetMapping("/remove")
    public String removeBook(){
        return "remove";
    }

    @PostMapping("/removed")
    public String RemovedBook(@RequestParam("bookName") String targetBookName){

        Book bookToDelete=fbook.findBookIdbyBookName(targetBookName);
        
        //Optional<Book> bookToRemove=bookRepo.findById(bookId);
        //Book bookToDelete=bookToRemove.orElse(null);
        if(bookToDelete!=null){
            bookRepo.delete(bookToDelete);
            return "removed";
        }else{
            return "error";
        }
    }
}
