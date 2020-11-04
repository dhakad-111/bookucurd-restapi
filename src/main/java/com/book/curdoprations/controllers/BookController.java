package com.book.curdoprations.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.curdoprations.entity.Book;
import com.book.curdoprations.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	// retrieve all books handler
	@GetMapping("/books")
	public List<Book> retrieveAllBook() {

		return this.bookService.retrieveAllBooks();

	}

	// retrieve single book  handler
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> retrieveBookById(@PathVariable("id") int id) {
		Book bookById = bookService.retrieveBookById(id);
		if(bookById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bookById));
	}
	
	
	// created a new book handler
	@PostMapping("/books")
	public Book CreateBook(@RequestBody Book book) {
		Book createBook = bookService.CreateBook(book);
		return createBook;
	}
	
	// delete book handler
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		
		bookService.deletedById(id);
		
	}
	
	
	// update book 
	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable("id") int id) {
		
		bookService.updateBook(book, id);
		
	}
	
	

}
