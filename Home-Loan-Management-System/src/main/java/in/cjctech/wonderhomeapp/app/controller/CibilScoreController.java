package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.service.CibilService;

@RestController
public class CibilScoreController 
{
	@Autowired
	CibilService cs;
	
	@PostMapping("/savecibil/{applicantid}")
	public ResponseEntity<CibilScore> createcibil(@PathVariable long applicantid,@RequestBody CibilScore cb)
	{
		CibilScore cb1=cs.addCibil(applicantid,cb);
		return new ResponseEntity<CibilScore>(cb1, HttpStatus.CREATED);
	}

	
}
