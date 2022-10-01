package com.masai.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer BookId;
	
	private String name;
	private String author;
	private String publication;
	private String category;
	private Integer pages;
	private Integer price;
	
//	@JsonIgnore
//	private List<Book> books;


	public Book(Integer bookId, String name, String author, String publication, String category, Integer pages,
			Integer price) {
		super();
		BookId = bookId;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		
	}


	
	
	
}
