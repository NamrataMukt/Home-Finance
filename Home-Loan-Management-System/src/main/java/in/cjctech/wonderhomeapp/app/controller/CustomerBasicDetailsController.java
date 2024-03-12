package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CustomerBasicDetails;
import in.cjctech.wonderhomeapp.app.service.CustomerBasicDetailsService;


@RestController
public class CustomerBasicDetailsController 
{
	@Autowired
	CustomerBasicDetailsService cas;
	
	@PostMapping("/saveCustomerBasicdetails")
	public ResponseEntity<CustomerBasicDetails> saveCustomerData(@RequestBody CustomerBasicDetails cbd )
	{
			CustomerBasicDetails cb=cas.saveCustomerData(cbd);
		return new ResponseEntity<CustomerBasicDetails>(cb,HttpStatus.CREATED);
	}

		
	@GetMapping("/getcustomerAllBasicDetails")
	public  ResponseEntity<List<CustomerBasicDetails>> getAllData()
	{
		
		List<CustomerBasicDetails> list1=cas.getAll();
        return new ResponseEntity<>(list1, HttpStatus.OK);
	}
	
	
	
}
