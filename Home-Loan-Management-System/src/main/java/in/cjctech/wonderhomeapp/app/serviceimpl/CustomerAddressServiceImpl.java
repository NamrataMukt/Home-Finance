package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.CustomerAddress;
import in.cjctech.wonderhomeapp.app.repository.CustomerAddressRepository;
import in.cjctech.wonderhomeapp.app.service.CustomerAddressService;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService
{
	@Autowired
	private CustomerAddressRepository car;

	@Override
	public CustomerAddress saveAddressData(CustomerAddress ca) 
	{
		CustomerAddress caddr=car.save(ca);
		return caddr;
	}
	

}
