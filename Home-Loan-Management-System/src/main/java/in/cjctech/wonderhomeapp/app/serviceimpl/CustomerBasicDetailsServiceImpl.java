package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.CustomerBasicDetails;
import in.cjctech.wonderhomeapp.app.repository.CustomerBasicDetailsRepository;
import in.cjctech.wonderhomeapp.app.service.CustomerBasicDetailsService;

@Service
public class CustomerBasicDetailsServiceImpl  implements CustomerBasicDetailsService
 {
	
	@Autowired
	CustomerBasicDetailsRepository cr;
	
	@Override
	public CustomerBasicDetails saveCustomerData(CustomerBasicDetails cbd) 
	{
		cr.save(cbd);
		return null;
	}

	@Override
	public List<CustomerBasicDetails> getAll() 
	{
		
		return cr.findAll();
	}

}
