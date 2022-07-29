package com.tnsif.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="student")
public class Student 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	
    @Column
	private String sname;
	
    @Column
	private String mailid;
}
