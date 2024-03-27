package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.model.StatusCheck;
import in.cjctech.wonderhomeapp.app.service.StatusService;

@CrossOrigin("*")
@RestController
public class StatusController {
	
	@Autowired
	private StatusService statusservice;
	
	
	@PostMapping("/savestatus/{customerId}")
	public ResponseEntity<StatusCheck> createcibil(@PathVariable long customerId,@RequestBody StatusCheck sc)
	{
		
		StatusCheck sc1=statusservice.addStatus(customerId,sc);
		
		return new ResponseEntity<StatusCheck>(sc1, HttpStatus.CREATED);
	}

}
