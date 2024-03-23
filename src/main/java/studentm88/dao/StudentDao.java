package studentm88.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import studentm88.dto.Student;

public class StudentDao {
	
	public void SaveStudent(Student student) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
	
	}
	
	
	public void UpdateStudent(int id, Student student) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		
		if(dbstudent!=null) {
			EntityTransaction entityTransaction  = entityManager.getTransaction();
			entityTransaction.begin();
			student.setId(id);
			entityManager.merge(student);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Student Id is not found in database");
		}
	}
	
	
	
	public void FindStudent(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		
		if(dbstudent!=null) {
			System.out.println(dbstudent);
		}else {
			System.out.println("Sorry Student Id is not found in database");
		}
		
	}
	
	
	public void DeleteStudent(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
			
		if(dbstudent!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbstudent);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Student Id is not found in database");
		}
		
	}
}

