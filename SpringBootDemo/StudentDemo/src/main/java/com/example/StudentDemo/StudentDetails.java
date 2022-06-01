package com.example.StudentDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	
	@Autowired
	private Student stud;
	
	 void setData()
	 {
		 stud.setId(100);
		 stud.setName("abc");
	 }
	
	 
	 void showData()
	 {
		 System.out.println(stud.getId());
		 System.out.println(stud.getName());
	 }
	

}
