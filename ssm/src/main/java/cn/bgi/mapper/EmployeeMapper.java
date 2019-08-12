package cn.bgi.mapper;

import java.util.List;

import cn.bgi.pojo.Employee;

public interface EmployeeMapper {
	public List<Employee>findEmployee(String name);
	public List<Employee>findEmployeeByPage(Integer page,Integer rows);
	public int insertEmployee(Employee employee) throws Exception;
	public int updateEmployee(Employee employee) throws Exception;
	public int deleteEmployee(int eno) throws Exception;
	public Employee findEmployeeByName(String username) throws Exception;
	public int findAllEmployee()throws Exception;
	public int countEmployeeByName(String username) throws Exception;
}
