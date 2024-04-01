package in.cjctech.wonderhomeapp.app.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CustomerBasicDetails;
import in.cjctech.wonderhomeapp.app.model.EmailSender;
import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.service.EmailSenderService;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;
import in.cjctech.wonderhomeapp.app.serviceimpl.SanctionLetterServiceImpl;
import in.cjctech.wonderhomeapp.app.utility.EmailHelper;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
//@CrossOrigin("*")
public class EmailSenderController {

	@Autowired EmailSenderService emailSenderService;
	
	@Autowired 
	SanctionLetterService ss;
	
	


	@PostMapping("/sendEmailTtoConstomer")
	public ResponseEntity<String> sendMail(@RequestBody EmailSender es) {
		
		boolean isMailSent=emailSenderService.sendMail(es);
		System.out.println(isMailSent);
		log.info("Mail sent to Successfully");
		return isMailSent ? new ResponseEntity<String>(StringUtils.join("Mail sent to ",  es.getToMail()),HttpStatus.OK) : 
			new ResponseEntity<String>(StringUtils.join("Unable to send mail to ",  es.getToMail()),HttpStatus.OK);
		
			}

		
	@GetMapping("/sendEmailToCustomerByCustomerd")
	public ResponseEntity<String> sendEmailToCustomerByCustomerd(@RequestParam(required = false)  Long eid ) {
		// fetch mail id 
	CustomerBasicDetails id=emailSenderService.getid(eid);
		
	//	System.out.println(eid);
		EmailSender es= new EmailSender(id.getCustomerEmailId(), (String) id.getStatusCode(), "Success");
		
		boolean isMailSent=emailSenderService.sendMail(es);
		//System.out.println(isMailSent);
		log.info(" Mail sent by Fetching database Id to Customer");
		
	
		
		return isMailSent ? new ResponseEntity<String>(StringUtils.join("Mail sent to ",  es.getToMail()),HttpStatus.OK) : 
			new ResponseEntity<String>(StringUtils.join("Unable to send mail to ",  es.getToMail()),HttpStatus.OK);
		
	   
	}
	
	@GetMapping("/sendSactionLetterIfApproved")
	public ResponseEntity<SanctionLetter> getDataById(@RequestParam long id){
		
		ss.getDataBysanctionId(id);
		
		log.atInfo().log("Mail Send To Sanctioned Customer");
		return null;
			}

	
	
}
