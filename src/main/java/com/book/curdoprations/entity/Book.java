package com.book.curdoprations.entity;

import java.util.Date;

public class Book {

	private Integer id;
	private String Name;
	private String Title;
	private double Price;
	private String Author;
	private Date CreatedAt;
	private Date UpdataedAt;

	public Book() {
		super();
	}

	public Book(String name, String title, double price, String author, Date createdAt, Date updataedAt) {
		super();
		Name = name;
		Title = title;
		Price = price;
		Author = author;
		CreatedAt = createdAt;
		UpdataedAt = updataedAt;
	}

	public Book(Integer id, String name, String title, double price, String author, Date createdAt, Date updataedAt) {
		super();
		this.id = id;
		Name = name;
		Title = title;
		Price = price;
		Author = author;
		CreatedAt = createdAt;
		UpdataedAt = updataedAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public Date getUpdataedAt() {
		return UpdataedAt;
	}

	public void setUpdataedAt(Date updataedAt) {
		UpdataedAt = updataedAt;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", Name=" + Name + ", Title=" + Title + ", Price=" + Price + ", Author=" + Author
				+ ", CreatedAt=" + CreatedAt + ", UpdataedAt=" + UpdataedAt + "]";
	}

}
