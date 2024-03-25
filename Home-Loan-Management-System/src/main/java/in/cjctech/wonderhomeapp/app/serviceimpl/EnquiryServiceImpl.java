package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.repository.EnquiryRepository;
import in.cjctech.wonderhomeapp.app.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired private EnquiryRepository er;
	
	@Override
	public Enquiry addEnquiry(Enquiry enquiry) {
		return er.save(enquiry);
	}
	
	@Override
	public void  addCibilScore(long customerId, CibilScore cibilscore) 
	{
		Optional<Enquiry> e=er.findAllByCustomerId(customerId);
		if(e.isPresent())
		{		
				Enquiry e1=e.get();
				e1.setCibilScore(cibilscore);
				er.save(e1);								
			
		}
	}

	public Enquiry updateEnquiry(long customerId, Enquiry updatedEnquiry) {
        Enquiry existingEnquiry = er.findById(customerId).orElseThrow(() -> new RuntimeException("Enquiry not found"));
       
        existingEnquiry.setCustomerName(updatedEnquiry.getCustomerName());
        existingEnquiry.setAge(updatedEnquiry.getAge());
        existingEnquiry.setCustomerEmailId(updatedEnquiry.getCustomerEmailId());
        existingEnquiry.setCustomerMobileNumber(updatedEnquiry.getCustomerMobileNumber());
        existingEnquiry.setPancardNumber(updatedEnquiry.getPancardNumber());
        existingEnquiry.setCity(updatedEnquiry.getCity());
        existingEnquiry.setPincode(updatedEnquiry.getPincode());
        existingEnquiry.setDate(updatedEnquiry.getDate());
        existingEnquiry.setEnquiry(updatedEnquiry.getEnquiry());
        return er.save(existingEnquiry);
    }

	@Override
	public Enquiry getCibilScoreByApplicantId(Long customerId) {
		return er.findByCustomerId(customerId);
	}

	@Override
	public void deleteEnquiry(Long customerId) {
		er.deleteById(customerId);
		
	}

	@Override
	public Enquiry getEnquiryById(long customerId) {
		return er.findByCustomerId(customerId);
	}

	
}
