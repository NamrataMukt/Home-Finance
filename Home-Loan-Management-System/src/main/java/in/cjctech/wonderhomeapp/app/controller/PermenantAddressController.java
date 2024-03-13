package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.PermenantAddress;
import in.cjctech.wonderhomeapp.app.service.PermenantAddressService;

@RestController
public class PermenantAddressController
{
	@Autowired
	private PermenantAddressService pas;
	
	@PostMapping("/savePermenantAddress")
	public ResponseEntity<PermenantAddress> savePermenantAddress(@RequestBody PermenantAddress paddr)
	{
		PermenantAddress pa=pas.savePermenantAddress(paddr);
		return new ResponseEntity<PermenantAddress>(pa,HttpStatus.CREATED);
	}

}
