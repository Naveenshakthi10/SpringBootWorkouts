package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Organisation;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Long>{
	Organisation findByid(long id);

}
