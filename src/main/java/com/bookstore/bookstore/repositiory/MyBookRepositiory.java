package com.bookstore.bookstore.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.entity.MyBookList;

@Repository
public interface MyBookRepositiory extends JpaRepository<MyBookList, Integer> {

}
