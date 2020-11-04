package com.book.curdoprations.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.book.curdoprations.entity.Book;

@Service
public class BookService {

	
	public static int usersCount = 4;
	
	// create temp book
	private static List<Book> books = new ArrayList<>();

	static {
		
		books.add(new Book(1,"Java","A Beginner's Guide",586.00,"Herbert Schildt", new Date(),new Date()));
		books.add(new Book(2,"c++","The complete reference",600.00,"Herbert Schildt", new Date(),new Date()));
		books.add(new Book(3,"Algorithms","introduction of algorithms",1500.00,"cormen", new Date(),new Date()));
		books.add(new Book(4,"Data Structure","Data Structure using c",500.00,"Reema Thareja", new Date(),new Date()));
		

	}

	// method that retrieve all books from books
	public List<Book> retrieveAllBooks() {
		return books;
	}

	// method that retrieve single book from books
	public Book retrieveBookById(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}
	
	
	// method that add the book in the books
	public Book CreateBook(Book book) {
		
		if(book.getId() == null) {
			book.setId(++usersCount);
		}
		books.add(book);
		return book;
		
	}
	
	// delete book by Id from books
	public void deletedById(int id) {
	      Iterator<Book> iterator = books.iterator();
	      
	      while(iterator.hasNext()) {
	    	  Book book = iterator.next();
	    	  
	    	  if(book.getId() == id) {
	    		  iterator.remove();
	    	  }
	      }
	}
	
	// updated book by id
	public void updateBook(Book book, int id) {
		for(Book b: books) {
			if(b.getId() == id) {
				b.setName(book.getName());
				b.setTitle(book.getTitle());
				b.setPrice(book.getPrice());
				b.setAuthor(book.getAuthor());
				b.setUpdataedAt(book.getUpdataedAt());
			}
		}
	}

}
