package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.PreviousLoanDetails;
import in.cjctech.wonderhomeapp.app.repository.PreviousLoanRepository;
import in.cjctech.wonderhomeapp.app.service.PreviousLoanService;

@Service
public class PreviousLoanServiceImpl implements PreviousLoanService
{
	@Autowired
	PreviousLoanRepository pr;
	
	@Override
	public PreviousLoanDetails addPreviousload(PreviousLoanDetails pld) 
	{
		return pr.save(pld);
	}

	@Override
	public List<PreviousLoanDetails> getAllData() 
	{
	
		return pr.findAll();
	}

}
