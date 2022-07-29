package com.tnsif.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> //ORM is happening with the help of JPA
{

}


