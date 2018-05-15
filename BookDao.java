package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Book;
import com.app.model.User;
import com.app.repository.BookRepository;

@Service
public class BookDao {
	
@Autowired
BookRepository bookRepo;

public Book save(Book book){
	return bookRepo.save(book);
}

//search all employees

public List<Book> findAll(){
	return bookRepo.findAll();
	
}
//get an employee

public Book findOne(long id){
	return bookRepo.findOne(id);
}

//delete an employee

public void delete(Book book){
	bookRepo.delete(book);
}
}
