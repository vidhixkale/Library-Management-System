package com.lib.libraryManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.libraryManagement.entity.Book;

public interface BookRepo extends JpaRepository<Book,Long>{
}
