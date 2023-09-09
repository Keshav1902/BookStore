package com.bookstore.bookstore.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookstore.bookstore.entity.Book;

@Repository
public interface BookRepositiory extends JpaRepository<Book, Integer> {

}
