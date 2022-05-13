package com.example.demo.Service;

import com.example.demo.Dto.OrganisationDto;
import com.example.demo.Model.Organisation;

public interface Organisationservice {
	
	Organisation saveOrganization(OrganisationDto organisationDto);
	
}
