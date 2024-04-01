package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.EmploymentDetails;

public interface EmploymentDetailsService {


	public EmploymentDetails addEmploymentDetails(String employmentDetails, MultipartFile salaryslip);

	public List<EmploymentDetails> getAllEmployement();

}
