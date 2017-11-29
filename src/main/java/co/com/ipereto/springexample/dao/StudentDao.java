package co.com.ipereto.springexample.dao;

import java.util.Collection;

import co.com.ipereto.springexample.models.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	Student deleteStudentById(int id);

	void updateStudent(Student student);

	void insertStudent(Student student);

}