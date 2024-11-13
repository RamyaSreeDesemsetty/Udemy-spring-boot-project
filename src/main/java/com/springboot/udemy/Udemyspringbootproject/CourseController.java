package com.springboot.udemy.Udemyspringbootproject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
@RequestMapping("/Courses")
public List<Course> retrieveAllCourses(){
	 return Arrays.asList(new Course(1,"Java","Udemy"),
			 new Course(2,"SpringBoot","Udemy"),
			 new Course(3,"Aws","Udemy"), 
			 new Course(4,"Azure","Udemy"));
 }
}
