package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.PermenantAddress;
import in.cjctech.wonderhomeapp.app.repository.PermenantAddressRepository;
import in.cjctech.wonderhomeapp.app.service.PermenantAddressService;

@Service
public class PermenantAddressServiceImpl implements PermenantAddressService
{
	@Autowired
     private PermenantAddressRepository par;

	@Override
	public PermenantAddress savePermenantAddress(PermenantAddress paddr)
	{
		
		
		return par.save(paddr);
	}
	

}
