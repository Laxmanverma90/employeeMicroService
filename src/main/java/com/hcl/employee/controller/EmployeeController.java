package com.hcl.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.employee.dto.EmployeeDto;
import com.hcl.employee.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;


/**
 * @author Laxman
 * @date 19 SEPT 2019
 */
@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * @param employeeId
	 * @return EmployeeDto
	 */
	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<EmployeeDto> getManager(@PathVariable Integer employeeId){
		
		log.info("EmployeeController :: getManager --");
		return new ResponseEntity<>(employeeService.getManager(employeeId), HttpStatus.OK);
	}
}
