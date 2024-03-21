package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.repository.CibilServiceRepository;
import in.cjctech.wonderhomeapp.app.repository.EnquiryRepository;
import in.cjctech.wonderhomeapp.app.service.CibilService;

@Service
public class CibilScoreServiceImpl implements CibilService
{

	@Autowired
	CibilServiceRepository cr;
	
	@Autowired 
	EnquiryRepository er;
	
	@Override
	public CibilScore addCibil(long applicantid, CibilScore cb) 
	{
		Optional<Enquiry> e=er.findAllByApplicantId(applicantid);
		if(e.isPresent())
		{
			Enquiry e1=e.get();
			e1.setCibilScore(cb);
			cr.save(cb);
			er.save(e1);
		}
		return null;
	}

}
