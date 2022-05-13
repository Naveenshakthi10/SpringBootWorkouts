package com.example.demo.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.OrganisationDto;
import com.example.demo.Model.Organisation;
import com.example.demo.Response.DefaultResponse;
import com.example.demo.Service.Organisationservice;

@RestController
@RequestMapping("/org")
public class OrganisationController {
	
	@Autowired
	private Organisationservice organisationService;
	
	@PostMapping("/save")
	public DefaultResponse saveOrg(@RequestBody OrganisationDto organisationDto)throws Exception{
				
		Organisation organisation = organisationService.saveOrganization(organisationDto);
		if(organisation!=null) {
			return new DefaultResponse(new Date(), "Success",HttpStatus.OK);
		}
		return new DefaultResponse(new Date(), "Failed", HttpStatus.BAD_REQUEST);
	}
		
}
