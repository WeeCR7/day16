package cn.bgi.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.bgi.pojo.DataResult;
import cn.bgi.pojo.Employee;
import cn.bgi.pojo.Pagination;
import cn.bgi.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Resource
	private EmployeeService employeeService;
	// 获取员工信息
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public DataResult<Employee> get(String ename,Integer page,Integer rows) throws Exception {
		if(ename!=null) {
			List<Employee> list2 = employeeService.findEmployee(ename);
			return new DataResult<Employee>(list2.size(), list2);
		}else {
			//对员工信息进行分页
			Pagination pagination = new Pagination();
			pagination.setPage(page);
			pagination.setRows(rows);
			List<Employee> list1 = employeeService.findEmployeeByPage(pagination.getStart(),rows);
			return new DataResult<Employee>(employeeService.findAllEmployee(), list1);
		}
	}

	// 更新员工信息
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(Employee employee, HttpServletResponse response) throws Exception {
		boolean result = true;
		if (employeeService.countEmployeeByName(employee.getUsername())>0) {
			result = false;
		}
		if (result) {
			employeeService.updateEmployee(employee);
		}
		response.getWriter().write("" + result);
	}

	// 插入员工

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insert(Employee employee, HttpServletResponse response) throws Exception {
		int result = 0;
		if (employeeService.findEmployeeByName(employee.getUsername()) == null) {
			employeeService.insertEmployee(employee);
			result = 1;
		}
		response.getWriter().write("" + result);
	}

	// 删除员工
	@RequestMapping(value = "/delete", method = RequestMethod.POST)

	public void delete(@RequestParam(value = "eno") String eno, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		boolean result = false;
		int count = employeeService.deleteEmployee(Integer.parseInt(eno));
		if (count > 0) {
			result = true;
		}
		response.getWriter().write("" + result);

	}

}
