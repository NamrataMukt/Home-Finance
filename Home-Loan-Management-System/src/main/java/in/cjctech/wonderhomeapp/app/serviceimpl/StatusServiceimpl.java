package in.cjctech.wonderhomeapp.app.serviceimpl;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;
import in.cjctech.wonderhomeapp.app.model.StatusCheck;
import in.cjctech.wonderhomeapp.app.repository.ApplicantRepository;
import in.cjctech.wonderhomeapp.app.repository.StatusRepo;
import in.cjctech.wonderhomeapp.app.service.StatusService;

@Service
public class StatusServiceimpl implements StatusService {
	
	@Autowired
	private StatusRepo sr;
	@Autowired
	private ApplicantRepository ar;
	
	@Override
	public StatusCheck addStatus(long applicantno, String status)
	{
		Optional<CustomerApplicationForm> cf=ar.findById(applicantno);
			if(cf.isPresent())
			{
					CustomerApplicationForm c=cf.get();
					StatusCheck s=new StatusCheck();
					s.setStatus(status);
					s.setApplicationNumber(applicantno);
					c.setStatuscheck(s);
					sr.save(s);
					ar.save(c);
						return s;
			}
			return null;
	
	}

	@Override
	public List<StatusCheck> findStatus() 
	{
		
		return sr.findAll();
			
		
	}

	
		
}
