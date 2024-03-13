package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.cjctech.wonderhomeapp.app.model.EmploymentDetails;
import in.cjctech.wonderhomeapp.app.repository.EmploymentDetailsRepository;
import in.cjctech.wonderhomeapp.app.service.EmploymentDetailsService;

@Service
public class EmploymentDetailsServiceImpl implements EmploymentDetailsService {

	@Autowired
	private EmploymentDetailsRepository er;

	
	public EmploymentDetails addEmploymentDetails(String employmentDetails, MultipartFile salarySlip) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			EmploymentDetails employmentdetails=mapper.readValue(employmentDetails, EmploymentDetails.class);
			employmentdetails.setSalarySlip(salarySlip.getBytes());
			
			er.save(employmentdetails);
			
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	
//	public EmploymentDetails addEmploymentDetails(EmploymentDetails employmentdetails) {
//		
//		return er.save(employmentdetails);
//	}

}
