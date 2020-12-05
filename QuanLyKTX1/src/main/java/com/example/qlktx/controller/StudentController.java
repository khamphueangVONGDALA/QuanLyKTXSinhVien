package com.example.qlktx.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.qlktx.model.Student;
import com.example.qlktx.services.StudentService;



@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService stdservice;
	
	@GetMapping("/add")
	public String add(ModelMap m) {
		m.addAttribute("student",new Student());
		return "students/addOrEdit";
	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, Student std) {
		stdservice.save(std);
		model.addAttribute(std);
		
		return "students/addOrEdit";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name="id") Integer id) {
		Optional<Student>optStudent = stdservice.findById(id);
		if(optStudent.isPresent()) {
			model.addAttribute("student",optStudent.get());

		}else {
			return list(model);
		}
		return "students/addOrEdit";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(ModelMap model ,@PathVariable(name="id") Integer id) {
		stdservice.deleteById(id);
		return list(model);
	}
	
	@RequestMapping("/list")
	public String list(ModelMap model ) {
		List<Student>list=(List<Student>) stdservice.findAll();
		model.addAttribute("students",list);
		return "students/list";
	}
	
	@RequestMapping("/find")
	public String fine(ModelMap model,@RequestParam(defaultValue = "") String name) {
		List<Student>list =stdservice.findByNameLikeOrderByName(name);
		model.addAttribute("students",list);
		return "students/find";
	}
	
}
