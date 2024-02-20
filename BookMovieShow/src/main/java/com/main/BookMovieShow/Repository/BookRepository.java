package com.main.BookMovieShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.BookMovieShow.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
//	/ You can add custom query methods if needed
}
