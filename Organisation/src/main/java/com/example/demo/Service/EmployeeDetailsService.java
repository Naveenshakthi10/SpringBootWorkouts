package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.EmployeeDetailsDto;
import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Model.Organisation;

public interface EmployeeDetailsService {
	
	EmployeeDetails saveEmployeeDetails(EmployeeDetailsDto employeeDetailsDto);
    List<EmployeeDetails> getAllEmployeeDetails();
}
