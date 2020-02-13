package com.vp.dao1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.vp.model1.Student;

@Component
public class StudentDao {
	static List<Student> list =null;
	static {		
		list = new ArrayList<Student>(); 
		list.add(new Student(1, "Anil", "Mang"));
		list.add(new Student(2, "Aji", "Mang2"));
		list.add(new Student(3, "Sanal", "Pralin"));
		list.add(new Student(4, "Nibin", "Raj"));
	}
	public List<Student> getUsers(){		
		
		return StudentDao.list;
	}	
	public ResponseEntity<Student> insertUser(Student user){
		list.add(user);		
		return new ResponseEntity<Student>(user, HttpStatus.OK);
	}
	public ResponseEntity<Student> getUser(int id){
		for (Student user : list) {
			if(user.getUid() == id) {
				return new ResponseEntity<Student>(user, HttpStatus.OK);
			}
		}
		return null;
	}
	public int deleteUser(int id){
		for (Student user : list) {
			if(user.getUid() == id) {
				list.remove(user);
				return id;
			}
		}
		return 0;
	}
}