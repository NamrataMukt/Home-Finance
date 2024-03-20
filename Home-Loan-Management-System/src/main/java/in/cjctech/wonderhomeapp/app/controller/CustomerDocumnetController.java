package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.CustomerDocumentUpload;
import in.cjctech.wonderhomeapp.app.service.ApplicantService;
import in.cjctech.wonderhomeapp.app.service.CustomerDocumnetService;

@RestController
public class CustomerDocumnetController
{
	@Autowired
	CustomerDocumnetService as;
	
	@PostMapping("/savedocument")
	public ResponseEntity<CustomerDocumentUpload> uploadDocument(@RequestPart("panCard") MultipartFile pan,
																@RequestPart("aadharCard") MultipartFile aadhar,
																@RequestPart("addressProof") MultipartFile address,
																@RequestPart("cheque") MultipartFile cheque,
																@RequestPart("photo") MultipartFile photo,
																@RequestPart("sign") MultipartFile sign,
																@RequestPart("tax") MultipartFile tax,
																@RequestPart("statment") MultipartFile statment)
	{
		
		CustomerDocumentUpload cd=as.saveDocumnet(pan,aadhar,address,cheque,photo,sign,tax,statment);
		return new ResponseEntity<CustomerDocumentUpload>(cd,HttpStatus.CREATED);
		
	}
}
