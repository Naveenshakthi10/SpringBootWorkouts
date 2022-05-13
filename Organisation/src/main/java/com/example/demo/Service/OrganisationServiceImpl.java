package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.OrganisationDao;
import com.example.demo.Dto.EmployeeDetailsDto;
import com.example.demo.Dto.OrganisationDto;
import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Model.Organisation;

@Service
public class OrganisationServiceImpl implements Organisationservice{
	
	@Autowired
	private OrganisationDao organisationDao;
	
	@Override
	public Organisation saveOrganization(OrganisationDto organisationDto) {
		
		//model object creation
		Organisation organisation=new Organisation();
		
		//set value from dto
		organisation.setId(organisationDto.getId());
		organisation.setAddress(organisationDto.getAddress());
		organisation.setBranchname(organisationDto.getBranchname());
		organisation.setOrganisationName(organisationDto.getOragnisationName());
		organisation.setTotalemployees(organisationDto.getTotalemployees());
		organisation.setYear(organisationDto.getTotalemployees());
		
		//save
		try {
			organisation = organisationDao.save(organisation);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return organisation;
	}

	@Override
	public List<Organisation> getAllorgainisation() {
		// TODO Auto-generated method stub
		return organisationDao.findAll();
	}
	
	
	

}


  