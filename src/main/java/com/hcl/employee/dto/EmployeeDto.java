package com.hcl.employee.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * @author Laxman
 *
 */
@Setter
@Getter
@Builder
public class EmployeeDto {

	private Integer employeeId;
	private Integer managerId;
}
