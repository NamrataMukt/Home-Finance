package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.LoanDisbursement;
import in.cjctech.wonderhomeapp.app.repository.LoanDisbursementRepository;
import in.cjctech.wonderhomeapp.app.service.LoanDisbursementService;

@Service
public class LoanDisbursementServiceImpli implements LoanDisbursementService {

	
	@Autowired LoanDisbursementRepository lr;

	@Override
	public LoanDisbursement saveDisburmentData(LoanDisbursement details) {
		return lr.save(details);
	}

	@Override
	public List<LoanDisbursement> getAlldata() {
		List<LoanDisbursement> list=lr.findAll();
		return list;
	}
	
}
