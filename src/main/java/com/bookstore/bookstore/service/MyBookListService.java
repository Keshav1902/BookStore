package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.MyBookList;
import com.bookstore.bookstore.repositiory.MyBookRepositiory;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepositiory myBook;

	public void saveMyBooks(MyBookList book) {
		myBook.save(book);
	}

	public List<MyBookList> getAllMyBooks() {
		return myBook.findAll();
	}

	public void deleteById(int id) {
		myBook.deleteById(id);
	}
}
