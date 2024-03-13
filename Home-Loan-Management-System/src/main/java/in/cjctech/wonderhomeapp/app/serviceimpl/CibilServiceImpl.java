package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.repository.CibilServiceRepository;
import in.cjctech.wonderhomeapp.app.service.CibilService;

@Service
public class CibilServiceImpl implements CibilService {
	
	@Autowired
	 CibilServiceRepository cr;

	@Override
	public CibilScore addCibilScore(CibilScore cibilscore) {
		return cr.save(cibilscore);
		
	}

	

	

}
