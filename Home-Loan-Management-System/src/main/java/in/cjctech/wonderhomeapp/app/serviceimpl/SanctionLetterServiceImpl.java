package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.repository.SanctionLetterRepository;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;

@Service
public class SanctionLetterServiceImpl implements SanctionLetterService
{

		@Autowired
		SanctionLetterRepository sr;
		
	@Override
	public SanctionLetter saveSanctionLetter(SanctionLetter s)
	{
		
		return sr.save(s);
	}

	@Override
	public List<SanctionLetter> getAll() 
	{
	
		return sr.findAll();
	}

}
