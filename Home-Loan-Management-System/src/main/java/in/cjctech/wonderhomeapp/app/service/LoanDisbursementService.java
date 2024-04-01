package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import in.cjctech.wonderhomeapp.app.model.LoanDisbursement;


public interface LoanDisbursementService {

	public LoanDisbursement saveDisburmentData(LoanDisbursement details);

	public List<LoanDisbursement> getAlldata();

	

}
