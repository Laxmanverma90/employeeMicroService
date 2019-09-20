package com.hcl.employee.service;

import com.hcl.employee.dto.EmployeeDto;

/**
 * @author Laxman
 * @date 19 SEPT 2019
 */
public interface EmployeeService {

	/**
	 * @param employeeId
	 * @return EmployeeDto
	 */
	EmployeeDto getManager(Integer employeeId);

}
