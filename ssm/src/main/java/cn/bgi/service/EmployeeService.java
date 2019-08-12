package cn.bgi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.bgi.mapper.EmployeeMapper;
import cn.bgi.pojo.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	public List<Employee> findEmployeeByPage(Integer page,Integer rows) {
		return employeeMapper.findEmployeeByPage(page,rows);
	}
	public List<Employee> findEmployee(String ename) {
		return employeeMapper.findEmployee(ename);
	}
	
	public int updateEmployee(Employee employee) throws Exception {
		int result = employeeMapper.updateEmployee(employee);
		return result;
	}
	public int insertEmployee(Employee employee) throws Exception{
		int result = employeeMapper.insertEmployee(employee);
		return result;
	}
	
	public int deleteEmployee(int eno) throws Exception{
		int result = employeeMapper.deleteEmployee(eno);
		return result;
	}
	public Employee findEmployeeByName(String username) throws Exception{
		Employee employee = employeeMapper.findEmployeeByName(username);
		return employee;
	}
	public int findAllEmployee() throws Exception{
		int result = employeeMapper.findAllEmployee();
		return result;
	}
	public int countEmployeeByName(String username) throws Exception{
		return employeeMapper.countEmployeeByName(username);
	}

}
