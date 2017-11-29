package co.com.ipereto.springexample.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.ipereto.springexample.dao.StudentDao;
import co.com.ipereto.springexample.models.Student;

@Service
public class StudentService {
	
	@Autowired
	//@Qualifier("fakeData")
	@Qualifier("mongoData")
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public Student deleteStudentById(int id) {
		return this.studentDao.deleteStudentById(id);
	}

	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
	}

	public void insertStudent(Student student) {
		this.studentDao.insertStudent(student);
	}
}
