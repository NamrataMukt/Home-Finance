package in.cjctech.wonderhomeapp.app.service;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.model.Enquiry;

public interface EnquiryService {

	Enquiry addEnquiry(Enquiry enquiry);


	void addCibilScore(long customerId, CibilScore cibilscore);

	public Enquiry updateEnquiry(long customerId, Enquiry updatedEnquiry);


	Enquiry getCibilScoreByApplicantId(Long customerId);


	public void deleteEnquiry(Long customerId);


}
