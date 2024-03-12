package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.DependantDetails;
import in.cjctech.wonderhomeapp.app.service.DependantDetailsService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DependantController 
{
	@Autowired
	private DependantDetailsService dds;
	
	@PostMapping("/saveDependantDetails")
	public ResponseEntity<DependantDetails>saveDependantDetails(@RequestBody DependantDetails dd)
	{
		DependantDetails details=dds.saveDependantDetails(dd);
		return new ResponseEntity<DependantDetails>(details,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getDependantDetails")
	public ResponseEntity<List<DependantDetails>>getDependantDetails()
	{
		List<DependantDetails> ldetails=dds.getDependantDetails();
		
		return new ResponseEntity<List<DependantDetails>>(ldetails, HttpStatus.OK);
	}
	

}
