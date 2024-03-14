package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.service.EnquiryService;

@RestController

public class EnquiryController 
{
	@Autowired private EnquiryService es;
	
	@PostMapping("/Customers")
	public ResponseEntity<Enquiry> createEnquiry(@RequestBody Enquiry enquiry)
	{
		Enquiry enq= es.addEnquiry(enquiry);
		return new ResponseEntity<Enquiry>(enq,HttpStatus.CREATED);
		
	}
	
	
	
}
