package co.com.ipereto.springexample.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

import co.com.ipereto.springexample.models.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {
	private static Map<Integer, Student> students;
	static{
		students = new HashMap<Integer, Student>(){
			{
				put(1,new Student(1,"Said","Computer Science"));
				put(2,new Student(2,"Said","Computer Science"));
				put(3,new Student(3,"Said","Computer Science"));
			}
		};
	}
	
	/* (non-Javadoc)
	 * @see co.com.ipereto.springexample.dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	/* (non-Javadoc)
	 * @see co.com.ipereto.springexample.dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return this.students.get(id);
	}

	/* (non-Javadoc)
	 * @see co.com.ipereto.springexample.dao.StudentDao#deleteStudentById(int)
	 */
	@Override
	public Student deleteStudentById(int id) {
		return this.students.remove(id);
	}

	/* (non-Javadoc)
	 * @see co.com.ipereto.springexample.dao.StudentDao#updateStudent(co.com.ipereto.springexample.models.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		students.put(student.getId(), s);
	}

	/* (non-Javadoc)
	 * @see co.com.ipereto.springexample.dao.StudentDao#insertStudent(co.com.ipereto.springexample.models.Student)
	 */
	@Override
	public void insertStudent(Student student) {
		this.students.put(student.getId(), student);
	}
}
