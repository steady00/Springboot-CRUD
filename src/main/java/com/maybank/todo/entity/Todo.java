package com.maybank.todo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "todos")
public class Todo {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column( nullable = false)
	private String user;
	
	@Column( nullable = false)
	private String description;
	
	@Column( nullable = false)
	private String targetDate;
	
	private int starMeter;
	
}
