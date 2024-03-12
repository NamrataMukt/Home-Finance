package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.DependantDetails;
import in.cjctech.wonderhomeapp.app.repository.DependantDetailsRepository;
import in.cjctech.wonderhomeapp.app.service.DependantDetailsService;

@Service
public class DependantDetailsServiceImpl implements DependantDetailsService
{
	@Autowired
	private DependantDetailsRepository ddr;

	@Override
	public DependantDetails saveDependantDetails(DependantDetails dd) 
	{
		
		return ddr.save(dd);
	}

	@Override
	public List<DependantDetails> getDependantDetails()
	{
		List<DependantDetails> list=ddr.findAll();
		return list;
	}

}
