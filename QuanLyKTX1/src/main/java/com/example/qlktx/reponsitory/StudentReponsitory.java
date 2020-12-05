package com.example.qlktx.reponsitory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.qlktx.model.Student;

@Repository
public interface StudentReponsitory extends CrudRepository<Student, Integer >{
	List<Student>findByNameLikeOrderByName(String name);
	
}
