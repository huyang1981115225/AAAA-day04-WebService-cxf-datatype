package cn.tedu.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import cn.tedu.bean.Student;

@WebService
public class DataTypeWSImpl implements DataTypeWS {

	@Override
	public boolean addStudent(Student student) {
		System.out.println("Server addStudent()");
		return true;
	}

	@Override
	public Student getStudentById(int id) {
		System.out.println("Server getStudentById() "+id);
		return new Student(id, "Tom", 14000);
	}

	@Override
	public List<Student> getStudentsBySalary(float salary) {
		System.out.println("Server addStudent() "+salary);
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Tom1", salary+1));
		list.add(new Student(2, "Tom2", salary+2));
		list.add(new Student(3, "Tom3", salary+3));
		return list;
	}

	@Override
	public Map<Integer, Student> getAllStudens() {
		System.out.println("Server getAllStudens() ");
		Map<Integer, Student> map = new HashMap<Integer,Student>();
		map.put(4, new Student(4, "Jack4", 4000));
		map.put(5, new Student(5, "Jack5", 5000));
		map.put(6, new Student(6, "Jack6", 6000));
		return map;
	}

}
