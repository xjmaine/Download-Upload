package io.downloadUpload.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.downloadUpload.models.Student;
import io.downloadUpload.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student createStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> getAllStudents(){
		return repository.findAll();
	}
	
	public Optional<Student> findStudentById(long id){
		return repository.findById(id);
	}

}
