package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;
import in.cjctech.wonderhomeapp.app.repository.ApplicantRepository;
import in.cjctech.wonderhomeapp.app.service.ApplicantService;

@Service
public class ApplicantServiceImpl implements ApplicantService
{

	@Autowired
	ApplicantRepository ar;
	
	@Override
	public CustomerApplicationForm saveApplicant(CustomerApplicationForm applicantform) 
	{
		return ar.save(applicantform);
	}

}
