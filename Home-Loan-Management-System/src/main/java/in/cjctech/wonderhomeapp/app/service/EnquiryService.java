package in.cjctech.wonderhomeapp.app.service;

import in.cjctech.wonderhomeapp.app.model.Enquiry;

public interface EnquiryService {

	Enquiry addEnquiry(Enquiry enquiry);

	public Enquiry updateEnquiry(long applicantId, Enquiry updatedEnquiry);

}
