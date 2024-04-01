package in.cjctech.wonderhomeapp.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import in.cjctech.wonderhomeapp.app.model.StatusCheck;
import in.cjctech.wonderhomeapp.app.service.StatusService;

@CrossOrigin("*")
@RestController
public class StatusController {
	
	@Autowired
	private StatusService ss;
	
	
	@PostMapping("/savestatus/{applicantno}")
	public ResponseEntity<StatusCheck> createstatus(@PathVariable long applicantno,@RequestBody String status )
	{
		
	
		StatusCheck sc1=ss.addStatus(applicantno,status);
		System.out.println(sc1);
		return new ResponseEntity<StatusCheck>(sc1, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllStatus")
	public ResponseEntity<List<StatusCheck>> getstatus()
	{
		List<StatusCheck> s = ss.findStatus();
		return new ResponseEntity<List<StatusCheck>>(s,HttpStatus.OK);
		
	}
	
	
}
