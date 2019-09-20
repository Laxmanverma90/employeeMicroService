package com.hcl.employee.testCase;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.hcl.employee.controller.EmployeeController;
import com.hcl.employee.dto.EmployeeDto;
import com.hcl.employee.service.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

	@Mock
	private EmployeeServiceImpl employeeServiceImpl;
	
	@InjectMocks
	private EmployeeController employeeController;
	
	private EmployeeDto employeeDto=null;
	@Before
	public void setUp() {
		employeeDto = EmployeeDto.builder().employeeId(101).managerId(10).build();
	}
	
	@Test
	public void getManagerTest() {
	
		ResponseEntity<EmployeeDto> expectedResult = new ResponseEntity<>(employeeDto,HttpStatus.OK);
		Mockito.when(employeeServiceImpl.getManager(101)).thenReturn(employeeDto);
		ResponseEntity<EmployeeDto> actualResult = employeeController.getManager(101);
		
		assertEquals(expectedResult.getBody().getManagerId(), actualResult.getBody().getManagerId());
	}
}
