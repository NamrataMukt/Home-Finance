package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import in.cjctech.wonderhomeapp.app.model.PreviousLoanDetails;

public interface PreviousLoanService {

	public PreviousLoanDetails addPreviousload(PreviousLoanDetails pld);

	public List<PreviousLoanDetails> getAllData();

}
