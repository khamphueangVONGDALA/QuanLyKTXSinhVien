package com.example.qlktx.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qlktx.model.Student;
import com.example.qlktx.reponsitory.StudentReponsitory;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentReponsitory stdReponsitory;

	@Override
	public Student save(Student entity) {
		return stdReponsitory.save(entity);
	}

	@Override
	public List<Student> saveAll(List<Student> entities) {
		return (List<Student>)stdReponsitory.saveAll(entities);
	}

	@Override
	public Optional<Student> findById(Integer id) {
		return stdReponsitory.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return stdReponsitory.existsById(id);
	}

	@Override
	public Iterable<Student> findAll() {
		return stdReponsitory.findAll();
	}

	@Override
	public List<Student> findAllById(List<Integer> ids) {
		return (List<Student>)stdReponsitory.findAllById(ids);
	}

	@Override
	public long count() {
		return stdReponsitory.count();
	}

	@Override
	public void deleteById(Integer id) {
		stdReponsitory.deleteById(id);
	}

	@Override
	public void delete(Student entity) {
		stdReponsitory.delete(entity);
	}

	@Override
	public void deleteAll(List<Student> entities) {
		stdReponsitory.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		stdReponsitory.deleteAll();
	}

	@Override
	public List<Student> findByNameLikeOrderByName(String name) {
		return stdReponsitory.findByNameLikeOrderByName("%"+name+"%");
	}

	
	
	

}
