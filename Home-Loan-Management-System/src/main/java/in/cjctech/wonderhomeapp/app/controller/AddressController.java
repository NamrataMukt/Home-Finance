package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CustomerAddress;
import in.cjctech.wonderhomeapp.app.service.CustomerAddressService;

@RestController
public class AddressController 
{
	@Autowired 
	private CustomerAddressService cas;
	
	@PostMapping("/saveAddressData")
	public ResponseEntity<CustomerAddress> saveAddress(@RequestBody CustomerAddress ca)
	{
		CustomerAddress caddr=cas.saveAddressData(ca);
		return new ResponseEntity<CustomerAddress>(caddr,HttpStatus.CREATED);
	}

}
