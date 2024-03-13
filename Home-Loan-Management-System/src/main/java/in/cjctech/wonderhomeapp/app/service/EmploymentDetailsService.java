package in.cjctech.wonderhomeapp.app.service;

import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.EmploymentDetails;

public interface EmploymentDetailsService {

//	public EmploymentDetails addEmploymentDetails(EmploymentDetails employmentdetails);

	public EmploymentDetails addEmploymentDetails(String employmentDetails, MultipartFile salarySlip);

}
