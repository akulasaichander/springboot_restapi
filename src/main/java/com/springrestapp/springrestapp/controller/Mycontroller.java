package com.springrestapp.springrestapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapp.springrestapp.entities.Courses;
import com.springrestapp.springrestapp.services.CourseService;


@RestController
public class Mycontroller {
	
	@Autowired
	private CourseService courseService ;

	@GetMapping("/home")
	public String home() {
		
		return "Welcome to courses application";
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/course/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		
		return this.courseService.getCourse(Long.parseLong(courseId));
				
	}
	
	
	@PostMapping("/addCourse")
	public Courses addCourse(@RequestBody Courses courses) 
	{
		return this.courseService.addCourse(courses);
	}
	
	@PutMapping("/updateCourse")
	public Courses updateCourse(@RequestBody Courses courses) 
	{
		return this.courseService.updateCourse(courses);
	}
	
	@DeleteMapping("/deleteCourse/{courseId}")
	public Courses deleteCourse(@PathVariable String courseId) {
		
		return this.courseService.deleteCourse(Long.parseLong(courseId));
				
	}
	
	
	
	
	
	
}
