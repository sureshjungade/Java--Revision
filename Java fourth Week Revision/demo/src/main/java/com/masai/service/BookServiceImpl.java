package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Book;
import com.masai.repository.BookDao;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookdao;
	
	@Override
	public List<Book> getBooks() {

		return bookdao.findAll();
		 
	}

	@Override
	public String addBooks(Book book) {
		
		bookdao.save(book);
		return "Book is added";
	}

	@Override
	public Book getBooksById(Integer id) {

		if(bookdao.findById(id).isPresent()) {
			System.out.println(bookdao.findById(id).get().getName());
			return bookdao.findById(id).get();
			
		}else {
			return null;
		}
		
		
		
	}

	@Override
	public String deleteBookById(Integer id) {
		
		bookdao.deleteById(id);
		return "Book is deleted";
		
		
	}

	@Override
	public String updateBookById(Integer id) {

		Optional<Book> bk= bookdao.findById(id);
		if(bk.isPresent()) {
			Book book = bk.get();
			book.setAuthor("Chetan Bhagat");
			bookdao.save(bookdao.findById(id).get());
			return "Book is updated";
		}else {
			return "Book is not available in database";
		}
		
	}
	

}
