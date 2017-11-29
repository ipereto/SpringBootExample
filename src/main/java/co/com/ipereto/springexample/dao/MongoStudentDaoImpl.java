package co.com.ipereto.springexample.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import co.com.ipereto.springexample.models.Student;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao{

	@Override
	public Collection<Student> getAllStudents() {
		return new ArrayList<Student>() {
			{
				add(new Student(1,"Mario","Nothing"));
			}
		};
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
