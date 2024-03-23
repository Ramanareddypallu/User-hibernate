package studentm88.controller;

import java.util.Scanner;

import studentm88.dao.StudentDao;
import studentm88.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Student Applicatoion");
		System.out.println("please Enter a 1 to Save the data");
		System.out.println("please Enter a 2 to update the data");
		System.out.println("please Enter a 3 to find the data");
		System.out.println("please Enter a 4 to delete the data");
		System.out.println("please Enter a 5 to go out");
		
		Scanner scan = new Scanner(System.in);
	    int choice = scan.nextInt();
	    
	    StudentDao dao = new StudentDao();
	    
	    switch (choice) {
	    case 1:{
	    	System.out.println("Please enter a id");
	    	int id = scan.nextInt();
	    	System.out.println("Please enter a name");
	    	String name = scan.next();
	    	System.out.println("Please enter a branch");
	    	String branch = scan.next();
	    	
	    	Student student = new Student();
	    	student.setBranch(branch);
	    	student.setId(id);
	    	student.setName(name);
	    	dao.SaveStudent(student);
	    	System.out.println("Student data saved succussfully");
	    }break;
	   
	    case 2:{
		    System.out.println("Please enter a id");
		   	int id = scan.nextInt();
		    System.out.println("Please enter a name");
		   	String name = scan.next();
		    System.out.println("Please enter a branch");
		    String branch = scan.next();
		    
		    Student student = new Student();
	    	student.setBranch(branch);
	    	student.setId(id);
	    	student.setName(name);
	    	dao.UpdateStudent(id,student);
		    System.out.println("Student data Updated succussfully");
	    }break;
	    
	    case 3:{
	    	System.out.println("Please enter a id");
		   	int id = scan.nextInt();
		   	dao.FindStudent(id);
		   	System.out.println("Student data find succussfully");
	    }break;
	    
	    case 4:{
	    	System.out.println("Please enter a id");
		   	int id = scan.nextInt();
		   	dao.DeleteStudent(id);
		   	System.out.println("Student data student succussfully");
	    }break;
	    
	    case 5:{
	    	System.out.println("THANK YOU VISIT AGAIN");
	    }
	    }
	    
	    

	}

}
