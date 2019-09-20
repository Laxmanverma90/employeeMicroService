package com.hcl.employee.testCase;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.employee.dto.EmployeeDto;
import com.hcl.employee.entity.Employee;
import com.hcl.employee.repository.EmployeeRepository;
import com.hcl.employee.service.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;
	
	private Employee employee = null;
	private Optional<Employee> employeeOptional = null;
	
	@Before
	public void setUp() {
		employee = new Employee();
		employee.setName("Laxman");
		employee.setEmail("laxman@hcl.com");
		employee.setEmployeeId(101);
		employee.setManagerId(10);
		employee.setRoleId(3);
		
		employeeOptional = Optional.of(employee);
	}

	@Test
	public void getManagerTest() {
		Mockito.when(employeeRepository.findById(101)).thenReturn(employeeOptional);
		EmployeeDto actualResult = employeeServiceImpl.getManager(101);
		assertEquals(10, (int)actualResult.getManagerId());
	}
}


