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

import in.cjctech.wonderhomeapp.app.model.BuilderDetails;
import in.cjctech.wonderhomeapp.app.service.BuilderDetailsService;

@RestController
public class BuilderDetailsController
{
	@Autowired
	BuilderDetailsService bds;
	
	@PostMapping("/savebuilder")
	public  ResponseEntity<BuilderDetails> createBuilder(@RequestPart("builderdetails") String builderdetails,
														@RequestPart("BPan") MultipartFile BPan,
														@RequestPart("Baadhar") MultipartFile Baadhar)
	{
		BuilderDetails bd1=bds.addBuilder(builderdetails,BPan,Baadhar);
		return new ResponseEntity<BuilderDetails>(bd1, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getbuilder")
	public ResponseEntity<List<BuilderDetails>> getData()
	{
		List<BuilderDetails> list1=bds.getAllData();
		return new ResponseEntity<List<BuilderDetails>>(list1,HttpStatus.OK);
		
		
	}
}
