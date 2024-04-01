package in.cjctech.wonderhomeapp.app.service;



import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;


public interface ApplicantService {

	

	public CustomerApplicationForm saveApplicant(String applicant, MultipartFile salaryslip, MultipartFile Gaadhar,
			MultipartFile Baadhar, MultipartFile BPan, MultipartFile propertyProof, MultipartFile panCard,
			MultipartFile aadhar, MultipartFile address, MultipartFile cheque, MultipartFile photo, MultipartFile sign,
			MultipartFile tax, MultipartFile statment);

	public List<CustomerApplicationForm> getalldata();

	public void deleteData(long applicationNumber);

	public CustomerApplicationForm getfindData(long applicationNumber);

	public List<CustomerApplicationForm> getuserStatus(String status);

	

	
}
