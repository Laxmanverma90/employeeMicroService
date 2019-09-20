package com.hcl.employee.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Laxman
 * @date 19 SEPT 2019
 */
@Setter
@Getter
@Builder
public class EmployeeDto {

	private Integer employeeId;
	private Integer managerId;
}
