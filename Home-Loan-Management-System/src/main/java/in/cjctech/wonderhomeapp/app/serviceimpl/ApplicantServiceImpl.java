package in.cjctech.wonderhomeapp.app.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.cjctech.wonderhomeapp.app.model.BuilderDetails;
import in.cjctech.wonderhomeapp.app.model.CustomerAddress;
import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;
import in.cjctech.wonderhomeapp.app.model.CustomerBankDetails;
import in.cjctech.wonderhomeapp.app.model.CustomerBasicDetails;
import in.cjctech.wonderhomeapp.app.model.CustomerDocumentUpload;
import in.cjctech.wonderhomeapp.app.model.DependantDetails;
import in.cjctech.wonderhomeapp.app.model.EmploymentDetails;
import in.cjctech.wonderhomeapp.app.model.GuarantorDetails;
import in.cjctech.wonderhomeapp.app.model.Mortage;
import in.cjctech.wonderhomeapp.app.model.PreviousLoanDetails;
import in.cjctech.wonderhomeapp.app.repository.ApplicantRepository;
import in.cjctech.wonderhomeapp.app.service.ApplicantService;

@Service
public class ApplicantServiceImpl implements ApplicantService
{

	@Autowired
	ApplicantRepository ar;

	@Override
	public CustomerApplicationForm saveApplicant(String applicant, MultipartFile salaryslip, MultipartFile Gaadhar,
			MultipartFile Baadhar, MultipartFile BPan, MultipartFile propertyProof, MultipartFile panCard,
			MultipartFile aadhar, MultipartFile address, MultipartFile cheque, MultipartFile photo, MultipartFile sign,
			MultipartFile tax, MultipartFile statment)
	{
		
		
		
		ObjectMapper mapper=new ObjectMapper();
		try
		{
			CustomerApplicationForm cd=mapper.readValue(applicant,CustomerApplicationForm.class);
						
					CustomerBasicDetails cb=cd.getCustomerDetails();
								cd.setCustomerDetails(cb);
						DependantDetails dd=cd.getApplicantDependant();
								cd.setApplicantDependant(dd);
						CustomerAddress ad=cd.getCustomerAddress();
								cd.setCustomerAddress(ad);
						ad.setLocalAddress(cd.getCustomerAddress().getLocalAddress());
						ad.setPermenantAddress(cd.getCustomerAddress().getPermenantAddress());
						EmploymentDetails ed=cd.getEmploymentDetails();
							
						cd.setEmploymentDetails(ed);
						ed.setSalaryslip(salaryslip.getBytes());
							
						PreviousLoanDetails pd=cd.getPreviousloandata();
							cd.setPreviousloandata(pd);
						Mortage m=cd.getMortage();
						cd.setMortage(m);
						m.setPropertyProof(propertyProof.getBytes());
						GuarantorDetails gd=cd.getGuarantorDetails();
						cd.setGuarantorDetails(gd);
						gd.setGadhaar(Gaadhar.getBytes());
						CustomerBankDetails cbank=cd.getCustomerbankDetail();
			gd.setGadhaar(Gaadhar.getBytes());
			
					BuilderDetails bd=cd.getBuilderdetails();
								bd.setBaadharCard(Baadhar.getBytes());
								bd.setBpanCard(BPan.getBytes());
							
						CustomerDocumentUpload cdu=cd.getDocumentUpload();
									cdu.setPanCard(panCard.getBytes());
									cdu.setAadharCard(aadhar.getBytes());
									cdu.setAddressProof(address.getBytes());
									cdu.setApplicantPhoto(photo.getBytes());
									cdu.setApplicantSignature(sign.getBytes());
									cdu.setBankCheque(cheque.getBytes());
									cdu.setBankStatment(statment.getBytes());
									cdu.setIncometaxReturn(tax.getBytes());
				cd.setBuilderdetails(bd);
					cd.setDocumentUpload(cdu);
				   cd.setCustomerbankDetail(cbank);			
		ar.save(cd);			
							
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<CustomerApplicationForm> getalldata() 
	{
		return ar.findAll();
	}

	@Override
	public void deleteData(long applicationNumber) 
	{
	
		 ar.deleteById(applicationNumber);
		
	}

	@Override
	public CustomerApplicationForm getfindData(long applicationNumber) 
	{
	
		 Optional<CustomerApplicationForm>  caf= ar.findById(applicationNumber);
		 			if(caf.isPresent())
		 			{
		 				return caf.get();
		 			}
					return null;
		 			
	}

	@Override
	public List<CustomerApplicationForm> getuserStatus(String status) 
	{	
		List<CustomerApplicationForm> list=ar.findCustomerByStatus(status);
		return list;
	}

	

					
	
	
	
	
}
