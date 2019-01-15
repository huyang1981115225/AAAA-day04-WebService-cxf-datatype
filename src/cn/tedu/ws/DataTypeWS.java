package cn.tedu.ws;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import cn.tedu.bean.Student;

@WebService
public interface DataTypeWS {
	
	@WebMethod
	public boolean addStudent(Student student);
	
	@WebMethod
	public Student getStudentById(int id);
	
	/**
	 * 查询工资大于salary的学生
	 * @param salary
	 * @return
	 */
	@WebMethod
	public List<Student> getStudentsBySalary(float salary);
	
	@WebMethod
	public Map<Integer, Student> getAllStudens();
}
