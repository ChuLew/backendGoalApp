package com.example.codeengine.expense.model;
import java.time.Instant;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "expense")
public class Expense {
	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String description;
	
	private String location;
	
	@ManyToOne // many of these expenses can go under one category This variable is a foreign key to category table
	private Category category;
	
	//Expense should be connected to user and category using foreign keys
	@JsonIgnore
	@ManyToOne //many of these expenses can go under one user This variable is a foreign key to category table
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getExpensedate() {
		return expensedate;
	}

	public void setExpensedate(Instant expensedate) {
		this.expensedate = expensedate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
