package com.maybank.todo.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	
	//List<Todo> findAll(); 
	//Todo getById(Todo id);

}
