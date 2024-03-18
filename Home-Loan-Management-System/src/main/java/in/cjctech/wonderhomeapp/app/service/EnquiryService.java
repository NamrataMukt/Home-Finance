package in.cjctech.wonderhomeapp.app.service;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.model.Enquiry;

public interface EnquiryService {

	Enquiry addEnquiry(Enquiry enquiry);


	void addCibilScore(long applicantid, CibilScore cibilscore);

	public Enquiry updateEnquiry(long applicantId, Enquiry updatedEnquiry);


}
