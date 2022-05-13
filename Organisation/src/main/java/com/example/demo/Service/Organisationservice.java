package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.OrganisationDto;
import com.example.demo.Model.Organisation;

public interface Organisationservice {
	
	Organisation saveOrganization(OrganisationDto organisationDto);

	List<Organisation> getAllorgainisation();
	
}
