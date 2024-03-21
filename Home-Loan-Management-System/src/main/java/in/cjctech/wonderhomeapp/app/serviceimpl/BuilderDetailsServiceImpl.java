package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.cjctech.wonderhomeapp.app.model.BuilderDetails;

import in.cjctech.wonderhomeapp.app.repository.BuilderDetailsRepository;
import in.cjctech.wonderhomeapp.app.service.BuilderDetailsService;

@Service
public class BuilderDetailsServiceImpl  implements BuilderDetailsService
{
	@Autowired
	BuilderDetailsRepository bdr;

		@Override
	public BuilderDetails addBuilder(String builderdetails, MultipartFile BPan, MultipartFile Baadhar) 
		{
			ObjectMapper mapper=new ObjectMapper();
			try {
				BuilderDetails bd=mapper.readValue(builderdetails,BuilderDetails.class);
					bd.setBaadharCard(Baadhar.getBytes());
					bd.setBpanCard(BPan.getBytes());
					
					bdr.save(bd);
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
		public List<BuilderDetails> getAllData() 
		{
		
			return bdr.findAll();
		}

}
