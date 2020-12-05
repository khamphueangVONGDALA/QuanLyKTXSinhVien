package com.example.qlktx.services;

import java.util.List;
import java.util.Optional;

import com.example.qlktx.model.Student;

public interface StudentService  {

	void deleteAll();

	void deleteAll(List<Student> entities);

	void delete(Student entity);

	void deleteById(Integer id);

	long count();

	List<Student> findAllById(List<Integer> ids);

	Iterable<Student> findAll();

	boolean existsById(Integer id);

	Optional<Student> findById(Integer id);

	List<Student> saveAll(List<Student> entities);

	Student save(Student entity);

	List<Student> findByNameLikeOrderByName(String name);




}
