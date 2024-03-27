package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.LoanDisbursement;




@Service
public interface LoanDisbursementService {

	public LoanDisbursement saveDisburmentData(LoanDisbursement details);

	public List<LoanDisbursement> getAlldata();

	

}
