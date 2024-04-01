package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.controller.SancationLetterController;
import in.cjctech.wonderhomeapp.app.model.CustomerBasicDetails;
import in.cjctech.wonderhomeapp.app.model.EmailSender;
import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.repository.EmailSenderRepository;
import in.cjctech.wonderhomeapp.app.repository.SanctionLetterRepository;
import in.cjctech.wonderhomeapp.app.service.EmailSenderService;
import in.cjctech.wonderhomeapp.app.utility.EmailHelper;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmailSenderServiceImpl implements EmailSenderService{
	
	@Autowired private JavaMailSender sender;
	@Autowired private EmailSenderRepository emailSenderRepository;
	@Autowired private SanctionLetterRepository sanctionLetterRepository;
	@Value("${spring.mail.username}") private String fromMail;


	@Override
	public boolean sendMail(EmailSender es) {
		return false;
	
	}


	@Override
	public CustomerBasicDetails getid(Long eid) {
		// TODO Auto-generated method stub
		try {CustomerBasicDetails e=emailSenderRepository.findById(eid).get();
		return e;
			
		} catch (Exception e) {
			// TODO: handle exception
			log.info("exception Occurs for getCustomerEmailId ");
			return null;
		}
	}

	

		

}
