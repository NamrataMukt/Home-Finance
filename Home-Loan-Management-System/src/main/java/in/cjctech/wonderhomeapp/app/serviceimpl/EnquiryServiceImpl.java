package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public Enquiry updateEnquiry(long applicantId, Enquiry updatedEnquiry) {
        Enquiry existingEnquiry = er.findById(applicantId).orElseThrow(() -> new RuntimeException("Enquiry not found"));
       
        existingEnquiry.setApplicantName(updatedEnquiry.getApplicantName());
        existingEnquiry.setAge(updatedEnquiry.getAge());
        existingEnquiry.setEmail(updatedEnquiry.getEmail());
        existingEnquiry.setMobileNumber(updatedEnquiry.getMobileNumber());
        existingEnquiry.setPancardNumber(updatedEnquiry.getPancardNumber());
        existingEnquiry.setCity(updatedEnquiry.getCity());
        existingEnquiry.setPincode(updatedEnquiry.getPincode());
        existingEnquiry.setDate(updatedEnquiry.getDate());
        existingEnquiry.setEnquiry(updatedEnquiry.getEnquiry());
        return er.save(existingEnquiry);
    }

	
}
