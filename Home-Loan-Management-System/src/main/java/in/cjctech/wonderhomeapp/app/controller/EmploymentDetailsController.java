package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.EmploymentDetails;
import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.service.EmploymentDetailsService;

@RestController
public class EmploymentDetailsController {

	 @Autowired
	 private EmploymentDetailsService es;
	 

	 @PostMapping("/EmploymentDetails")
	 public ResponseEntity<String> saveEmploymentDetails(@RequestPart("employmentdetails") String employmentDetails,
			                                              @RequestPart("salaryslip") MultipartFile salarySlip){
			                                            	  
			EmploymentDetails employmentdetails=es.addEmploymentDetails(employmentDetails,salarySlip);                                             
	 return new ResponseEntity<String>("data added",HttpStatus.OK);
	 
	 
	 }
	  
}
