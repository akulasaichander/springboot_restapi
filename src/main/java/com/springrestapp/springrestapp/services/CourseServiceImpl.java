package com.springrestapp.springrestapp.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrestapp.springrestapp.entities.Courses;


@Service
public class CourseServiceImpl implements CourseService{
	
	List<Courses> list;
	
	public CourseServiceImpl() 
	{
		list=new ArrayList<>();
		list.add(new Courses(123,"cotains Core java info","Core Jaava",500));
		list.add(new Courses(124,"cotains Advance java info","Advance Jaava",500));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Courses c=null;
		
		for(Courses x:list){
			
			if(x.getId()==courseId) 
			{
				c=x;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
		Courses c=null ;
		
		for(Courses x:list){
			
			if(x.getId()==course.getId()) 
			{
				x.setName(course.getName());
				x.setDescription(course.getDescription());
				x.setId(course.getId());
				
				int  a=Integer.valueOf(course.getPrice());
				x.setPrice(a);
				
				c=x;
				list.remove(x);
				list.add(c);
				break;
			}
			
		}

		
		return c;
		
		
	}
	
	
	
	
	@Override
	public Courses deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses c=null;
		for(Courses x:list){
			
			if(x.getId()==courseId) 
			{
				c=x;
				list.remove(x);
				break;
			}
		}

		System.out.println("-------Deleted-------");
		System.out.println("");
		return c;
	}
	
	
}
