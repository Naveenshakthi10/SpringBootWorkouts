package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.EmployeeDetailsDto;
import com.example.demo.Model.EmployeeDetails;

public interface EmployeeDetailsService {
	
	EmployeeDetails saveEmployeeDetails(EmployeeDetailsDto employeeDetailsDto) throws Exception;
    List<EmployeeDetails> getAllEmployeeDetails();
}
