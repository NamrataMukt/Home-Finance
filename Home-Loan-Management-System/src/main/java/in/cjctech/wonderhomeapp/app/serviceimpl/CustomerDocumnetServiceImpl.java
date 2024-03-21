package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import in.cjctech.wonderhomeapp.app.model.CustomerDocumentUpload;
import in.cjctech.wonderhomeapp.app.repository.CustomerDocumentRepository;
import in.cjctech.wonderhomeapp.app.service.CustomerDocumnetService;

@Service
public class CustomerDocumnetServiceImpl implements CustomerDocumnetService
{
	@Autowired
	CustomerDocumentRepository cdr;
	
	@Override
	public CustomerDocumentUpload saveDocumnet(MultipartFile pan, MultipartFile aadhar, MultipartFile address,
			MultipartFile cheque, MultipartFile photo, MultipartFile sign, MultipartFile tax, MultipartFile statment)  
	{
		
		try
		{
			CustomerDocumentUpload cd=new CustomerDocumentUpload();
			cd.setPanCard(pan.getBytes());
			cd.setAadharCard(aadhar.getBytes());
			cd.setAddressProof(address.getBytes());
			cd.setBankCheque(cheque.getBytes());
			cd.setApplicantPhoto(photo.getBytes());
			cd.setApplicantSignature(sign.getBytes());
			cd.setIncometaxReturn(tax.getBytes());
			cd.setBankStatment(statment.getBytes());
			cdr.save(cd);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	
	}


}
