package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;

import in.cjctech.wonderhomeapp.app.service.ApplicantService;

@RestController
public class ApplicantController 
{
	@Autowired
	ApplicantService as;

	@PostMapping("/saveApplicant")
	public ResponseEntity<CustomerApplicationForm> getApplicant(@RequestBody CustomerApplicationForm applicantform)
	{
		CustomerApplicationForm cf1=as.saveApplicant(applicantform);
		return new ResponseEntity<CustomerApplicationForm>(cf1,HttpStatus.CREATED);
	}
	
	}
