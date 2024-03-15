package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.PreviousLoanDetails;
import in.cjctech.wonderhomeapp.app.service.PreviousLoanService;



@RestController
public class PreviousLoanController
{
	@Autowired
	PreviousLoanService ps;
	
	@PostMapping("/savePreviousloan")
	public ResponseEntity<PreviousLoanDetails> savePrevious(@RequestBody PreviousLoanDetails pld)
	{
		PreviousLoanDetails pd=ps.addPreviousload(pld);
		return new ResponseEntity<PreviousLoanDetails>(pd, HttpStatus.CREATED);
	}
	
	@GetMapping("/getPreviousLoan")
	public ResponseEntity<List<PreviousLoanDetails>> getData()
	{
		List<PreviousLoanDetails> list1=ps.getAllData();
		return new ResponseEntity<List<PreviousLoanDetails>>(list1,HttpStatus.OK);
	}
}
