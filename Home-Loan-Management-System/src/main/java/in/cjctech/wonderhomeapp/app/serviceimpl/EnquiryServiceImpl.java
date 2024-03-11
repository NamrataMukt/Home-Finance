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

}
