package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDetailsDao;
import com.example.demo.Dao.OrganisationDao;
import com.example.demo.Dto.EmployeeDetailsDto;
import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Model.Organisation;

@Service
public class EmployeeDetailsImpl implements EmployeeDetailsService {
	
	@Autowired
	private EmployeeDetailsDao employeeDetailsDao;
	@Autowired
	private OrganisationDao organisationDao;
	
	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetailsDto employeeDetailsDto) throws Exception {
		
		Organisation organisation=organisationDao.findByid(employeeDetailsDto.getOrgId());
		if(organisation==null) {
			throw new Exception("Organisation not found");
		}
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setId(employeeDetailsDto.getId());
		employeeDetails.setEmployeeId(employeeDetailsDto.getEmployeeId());
		employeeDetails.setAddress(employeeDetailsDto.getAddress());
		employeeDetails.setOrganisation(organisation);
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
   

