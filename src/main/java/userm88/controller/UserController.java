package userm88.controller;

import java.util.Scanner;

import userm88.dao.UserDao;
import userm88.dto.User;

public class UserController {
      
	public static void main (String[] args) {
		System.out.println("Welcome to User Application");
		System.out.println("Please enter 1 to save the data");
		System.out.println("enter 2 to update the data");
		System.out.println("enter 3 to Find the data");
		System.out.println("enter 4 to delete the data");
		System.out.println("enter 5 to go out");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		UserDao dao = new UserDao();
		switch (choice) {
		case 1:{
			
			System.out.println("Please enter name ");
			String name = scan.next();
			System.out.println("Please enter address ");
			String address = scan.next();
			
			User user = new User();
			user.setAddress(address);
			user.setName(name);
			
			dao.saveUser(user);
			System.out.println("THANK YOU DATA SAVED SUCCUSSFULLY");
		}break;
		
		case 2 :{
			System.out.println("Please enter id ");
			int id = scan.nextInt();
			System.out.println("Please enter name ");
			String name = scan.next();
			System.out.println("Please enter address ");
			String address = scan.next();
			
			User user = new User();
			user.setAddress(address);
			user.setName(name);
			user.setId(id);
			dao.UpdateUser(id, user);
			System.out.println("THANK YOU DATA UPDATED SUCCUSSFULLY");
		}break;
		
		case 3 :{
			System.out.println("Please enter id ");
			int id = scan.nextInt();
			dao.findUser(id);
			System.out.println("THANK YOU DATA SAVED SUCCUSSFULLY");
		}break;
		
		case 4 :{
			System.out.println("Please enter id ");
			int id = scan.nextInt();
			dao.deleteUser(id);
			System.out.println("THANK YOU DATA DELETED SUCCUSSFULLY");
		}break;
		
		case 5 :{
			System.out.println("THANK YOU VISIT AGAIN");
		}
		
		}
		
		}
}
