package com.example.codeengine.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codeengine.expense.model.Category;

//this is the database connection once you extend JpaRepository we are mapping category class to a database table. Long being the Id
public interface CategoryRepository extends JpaRepository<Category,Long>{
	//return a category when i pass a name

	//findBy<field> this is how you search the table 
	Category findByName(String name);
}
 