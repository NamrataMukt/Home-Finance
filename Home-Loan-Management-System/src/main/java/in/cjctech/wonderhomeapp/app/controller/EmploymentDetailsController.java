package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	 public ResponseEntity<EmploymentDetails> saveEmploymentDetails(@RequestPart("employmentdetails") String employmentDetails,
			                                              @RequestPart("salaryslip") MultipartFile salarySlip){
			                                            	  
			EmploymentDetails ed=es.addEmploymentDetails(employmentDetails,salarySlip);                                             
	 return new ResponseEntity<EmploymentDetails>(ed,HttpStatus.OK);
	 
	 
	 }
	 
	 @GetMapping("/getEmployement")
	 public ResponseEntity<List<EmploymentDetails>> getEmployement()
	 {
		 
		 List<EmploymentDetails> list1=es.getAllEmployement();
		 return new ResponseEntity<List<EmploymentDetails>>(list1,HttpStatus.OK);
	 }
	  
}
