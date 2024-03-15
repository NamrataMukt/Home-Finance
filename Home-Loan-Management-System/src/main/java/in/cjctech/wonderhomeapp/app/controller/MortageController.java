package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.Mortage;
import in.cjctech.wonderhomeapp.app.service.MortageService;


@RestController
public class MortageController 
{
	@Autowired
	MortageService ms;

	@PostMapping("/saveMortage")
	public ResponseEntity<Mortage> createMortage(@RequestPart("mortage") String mortage,
												@RequestPart("propertyProof") MultipartFile propertyproof)
	{
			Mortage m=ms.addMortage(mortage,propertyproof);
		return new ResponseEntity<Mortage>(m, HttpStatus.CREATED);
	}
	
	@GetMapping("/getMortage")
	public ResponseEntity<List<Mortage>> getMortage()
	{
		List<Mortage> list1=ms.getAllMortage();
		return new ResponseEntity<List<Mortage>>(list1,HttpStatus.OK);
	}
	
}
