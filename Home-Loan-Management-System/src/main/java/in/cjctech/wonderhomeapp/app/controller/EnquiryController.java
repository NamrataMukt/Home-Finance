package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.service.EnquiryService;

@CrossOrigin("*")
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

    @PutMapping("/updateEnquiry/{customerId}")
    public ResponseEntity<Enquiry> updateEnquiry(@PathVariable long customerId, @RequestBody Enquiry updatedEnquiry) {
        Enquiry updatedEnquiryResult = es.updateEnquiry(customerId,updatedEnquiry);
        return ResponseEntity.ok(updatedEnquiryResult);
    }
    
  
    
    @GetMapping("cibil/{customerId}")
    public ResponseEntity<Enquiry> getCibilScore(@PathVariable Long customerId) {
        Enquiry cibilScore = es.getCibilScoreByApplicantId(customerId);
       
            return ResponseEntity.ok(cibilScore);
        
            
  
    }

}
