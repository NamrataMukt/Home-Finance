package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.cjctech.wonderhomeapp.app.model.Mortage;
import in.cjctech.wonderhomeapp.app.repository.MortageRepository;
import in.cjctech.wonderhomeapp.app.service.MortageService;


@Service
public class MortageServiceImpl implements MortageService
{

		@Autowired
		MortageRepository mr;
		
	@Override
	public Mortage addMortage(String mortage, MultipartFile propertyproof) 
	{
		ObjectMapper mapper=new ObjectMapper();
		try {
			Mortage m=mapper.readValue(mortage,Mortage.class);
				m.setPropertyProof(propertyproof.getBytes());
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
	public List<Mortage> getAllMortage() 
	{
	
		return mr.findAll();
	}

}
