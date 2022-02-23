package com.springrestapp.springrestapp.services;

import java.util.List;

import com.springrestapp.springrestapp.entities.Courses;

public interface CourseService {
	
	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourse(Courses course);
	
	public Courses updateCourse(Courses course);
	
	public Courses deleteCourse(long courseId);
	

}
