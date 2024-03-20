package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.cjctech.wonderhomeapp.app.model.GuarantorDetails;
import in.cjctech.wonderhomeapp.app.repository.GuarantorDetailsRepository;
import in.cjctech.wonderhomeapp.app.service.GuarantorDetailsService;

@Service
public class GuarantorDetailsServiceImpl implements GuarantorDetailsService
{

		@Autowired
		GuarantorDetailsRepository gdr;
		
	

	@Override
	public GuarantorDetails saveGurantorDetails(String gurantor, MultipartFile Gaadhar)
	{
		ObjectMapper mapper=new ObjectMapper();
		try {
			GuarantorDetails gd=mapper.readValue(gurantor,GuarantorDetails.class);
				gd.setGadhaar(Gaadhar.getBytes());
				gdr.save(gd);
		} 
		
		catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}



	@Override
	public List<GuarantorDetails> getAllGurantor()
	{
		return gdr.findAll();
		
	}

}
