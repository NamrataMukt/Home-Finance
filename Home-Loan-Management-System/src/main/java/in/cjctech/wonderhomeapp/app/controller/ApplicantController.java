package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;

import in.cjctech.wonderhomeapp.app.service.ApplicantService;
@CrossOrigin("*")
@RestController
public class ApplicantController 
{
	@Autowired
	ApplicantService as;

	@PostMapping("/saveApplicant")
	public ResponseEntity<CustomerApplicationForm> getApplicant(@RequestPart("applicantdata") String  applicant,
																@RequestPart("salarySlip") MultipartFile salaryslip,
																@RequestPart("Gaadhar") MultipartFile Gaadhar,
																@RequestPart("Baadhar") MultipartFile Baadhar,
																@RequestPart("BPan") MultipartFile BPan,
																@RequestPart("propertyProof") MultipartFile propertyProof,
																@RequestPart("pan") MultipartFile panCard,
																@RequestPart("aadharCard") MultipartFile aadhar,
																@RequestPart("addressProof") MultipartFile address,
																@RequestPart("cheque") MultipartFile cheque,
																@RequestPart("photo") MultipartFile photo,
																@RequestPart("sign") MultipartFile sign,
																@RequestPart("tax") MultipartFile tax,
																@RequestPart("statment") MultipartFile statment)	
	{	
		CustomerApplicationForm cf1=as.saveApplicant(applicant,salaryslip,Gaadhar,Baadhar,BPan,propertyProof,panCard,aadhar,address,cheque,photo,sign,tax,statment);
		return new ResponseEntity<CustomerApplicationForm>(cf1,HttpStatus.CREATED);
	}
	
	}
