package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.LocalAddress;
import in.cjctech.wonderhomeapp.app.repository.LocalAddressRepository;
import in.cjctech.wonderhomeapp.app.service.LocalAddressService;

@Service
public class LocalAddressServiceImpl implements LocalAddressService
{
	@Autowired
	private LocalAddressRepository lar;

	@Override
	public LocalAddress saveLocalAddress(LocalAddress la) 
	{
		
		return lar.save(la);
	}
	

}
