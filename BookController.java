package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.BookDao;
import com.app.model.Book;

@RestController
@RequestMapping("/bookEntry")
public class BookController {
	@Autowired
	BookDao bookDao;
	
	@PostMapping("/book")
	public Book createUser(@RequestBody Book book){
		
			return bookDao.save(book);
		
	}
	
	@GetMapping("/books")
	public List<Book> getAllUsers(){
		return bookDao.findAll();
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getUserById(@PathVariable(value="id") long id){
		Book book=bookDao.findOne((id));
		if(book==null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(book);
	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> update(@PathVariable(value="id") int id, @RequestBody Book bookDetails){
		Book book=bookDao.findOne(id);
		if(book==null){
			return ResponseEntity.notFound().build();
		}
		book.setBookAuthor(bookDetails.getBookAuthor());
		book.setBookName(bookDetails.getBookName());
		book.setBookNumber(bookDetails.getBookNumber());
		book.setBookPrice(bookDetails.getBookPrice());
		Book updateBook=bookDao.save(book);
		return ResponseEntity.ok().body(updateBook);
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Book> delete(@PathVariable(value="id") int id)
	{
		Book book=bookDao.findOne(id);
		if(book==null){
			return ResponseEntity.notFound().build();
		}
		bookDao.delete(book);
		return ResponseEntity.ok().build();
		
	}
	
}
