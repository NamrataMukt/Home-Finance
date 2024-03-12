package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.GuarantorDetails;
import in.cjctech.wonderhomeapp.app.service.GuarantorDetailsService;

@RestController
public class GuarantorDetailsController 
{
	@Autowired
	GuarantorDetailsService gds;
	
	@PostMapping("/saveGurantorDetails")
	public ResponseEntity<GuarantorDetails> saveAddress(@RequestPart("gurantor") String gurantor,
														@RequestPart("adhaar") MultipartFile adhaar)
	{
		GuarantorDetails gd1=gds.saveGurantorDetails(gurantor,adhaar);
		return new ResponseEntity<GuarantorDetails>(gd1,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllGurantor")
	public ResponseEntity<List<GuarantorDetails>> getALL()
	{
		List<GuarantorDetails>list1  =gds.getAllGurantor();
		
		return new ResponseEntity<List<GuarantorDetails>>(list1,HttpStatus.OK);
	}

}
