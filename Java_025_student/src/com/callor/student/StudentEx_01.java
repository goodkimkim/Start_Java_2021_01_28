package com.callor.student;

import com.callor.student.impl.StudentVOImplV1;
import com.callor.student.service.StudentService;

public class StudentEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentService stService=new StudentVOImplV1();
		
		stService.LoadeFile();
		stService.SearchNamePrint();
		
		
		
		
	}

}
