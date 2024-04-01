package in.cjctech.wonderhomeapp.app.serviceimpl;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.repository.CustomerAddressRepository;
import in.cjctech.wonderhomeapp.app.repository.CustomerBasicDetailsRepository;
import in.cjctech.wonderhomeapp.app.repository.SanctionLetterRepository;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;
import in.cjctech.wonderhomeapp.app.utility.EmailHelper;
import in.cjctech.wonderhomeapp.app.utility.SanctionLetterPdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.repository.SanctionLetterRepository;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;
import in.cjctech.wonderhomeapp.app.utility.SanctionLetterPdf;

@Service
public class SanctionLetterServiceImpl implements SanctionLetterService
{
		@Autowired
		private SanctionLetterRepository sr;
		@Autowired EmailHelper emailHelper;
		
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

	@Override
	public ByteArrayInputStream generatePdf(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getDataBysanctionId(long id) {
		// TODO Auto-generated method stub
		
		emailHelper.emailsendComponent(sr.findById(id), true);
	}

	
	
	
	
}
