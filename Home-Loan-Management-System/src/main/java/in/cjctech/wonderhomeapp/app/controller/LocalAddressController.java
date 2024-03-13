package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.LocalAddress;
import in.cjctech.wonderhomeapp.app.service.LocalAddressService;

@RestController
public class LocalAddressController
{
	@Autowired
	private LocalAddressService las;
	
	@PostMapping("/saveLocalAddress")
	public ResponseEntity<LocalAddress> saveLocalAddress(@RequestBody LocalAddress la)
	{
		LocalAddress laddr=las.saveLocalAddress(la);
		
		return new ResponseEntity<LocalAddress>(laddr,HttpStatus.CREATED);
		
	}

}
