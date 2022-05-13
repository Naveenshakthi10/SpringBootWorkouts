package com.example.demo.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.EmployeeDetailsDto;
import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Response.DefaultResponse;
import com.example.demo.Service.EmployeeDetailsService;

@RestController
@RequestMapping("/empdet")
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsService employeeDetailsService;
	
	@PostMapping("/save")
    public DefaultResponse saveEmpdet(@RequestBody EmployeeDetailsDto employeeDetailsDto)throws Exception{
		
		EmployeeDetails employeeDetails = employeeDetailsService.saveEmployeeDetails(employeeDetailsDto);
		if (employeeDetails != null) {
			return new DefaultResponse(new Date(), "Success",HttpStatus.OK);
		}
		System.err.println("Failed");
		return new DefaultResponse(new Date(), "Failed", HttpStatus.OK);
		
	}
	
	@GetMapping("/find")
	 public  List<EmployeeDetails> getAllEmployeeDetails() throws Exception{
//		EmployeeDetails employeeDetails = employeeDetailsService;
		return employeeDetailsService.getAllEmployeeDetails();
					
	} 
}
