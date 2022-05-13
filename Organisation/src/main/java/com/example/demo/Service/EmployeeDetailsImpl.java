package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDetailsDao;
import com.example.demo.Dao.OrganisationDao;
import com.example.demo.Dto.EmployeeDetailsDto;
import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Repository.EmployeeDetailsRespository;

@Service
public class EmployeeDetailsImpl implements EmployeeDetailsService {
	
	@Autowired
	private EmployeeDetailsDao employeeDetailsDao;
	
	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetailsDto employeeDetailsDto) {
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		employeeDetails.setId(employeeDetailsDto.getId());
		employeeDetails.setEmployeeId(employeeDetailsDto.getEmployeeId());
		employeeDetails.setAddress(employeeDetailsDto.getAddress());
		employeeDetails.setDesignation(employeeDetailsDto.getDesignation());
		employeeDetails.setEmployeename(employeeDetailsDto.getEmployeename());
		employeeDetails.setRole(employeeDetailsDto.getRole());
		
		try {
			employeeDetails = employeeDetailsDao.save(employeeDetails);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	    return employeeDetails;
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeDetailsDao.findAll();
	}

	 
}
   

