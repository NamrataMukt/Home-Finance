package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.Enquiry;

@RestController
public class EnquiryController 
{
	public ResponseEntity<Enquiry> createEnquier(@RequestBody Enquiry enquiry)
	{
		return null;
		
	}
}
