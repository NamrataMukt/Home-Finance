package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.service.LoanDisbursementService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin("*")
public class LoanDisbursement {
	
@Autowired LoanDisbursementService ld;
	
	@PostMapping("/loandisbursement")
	public ResponseEntity<LoanDisbursement> SaveDisburmentData1(@RequestBody LoanDisbursement details) {
		//TODO: process POST request
		
		LoanDisbursement savedetails=ld.saveDisburmentData(details);
		log.atInfo().log("Data Save Succesfully");
		return new ResponseEntity<LoanDisbursement>(savedetails, HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/getalldisburmentdeatails")
	public ResponseEntity<List<LoanDisbursement>> getAllData()
	{
	List<LoanDisbursement> list1=ld.getAlldata();
			log.atInfo().log("All Data get");
		return new ResponseEntity<List<LoanDisbursement>>(list1,HttpStatus.OK);
	}

}
