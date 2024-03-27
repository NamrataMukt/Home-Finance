package in.cjctech.wonderhomeapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.StatusCheck;
import in.cjctech.wonderhomeapp.app.repository.StatusRepo;
import in.cjctech.wonderhomeapp.app.service.StatusService;

@Service
public class StatusServiceimpl implements StatusService {
	
	@Autowired
	private StatusRepo statusrepository;

	@Override
	public StatusCheck addStatus(long customerId, StatusCheck sc) {
		
		return statusrepository.save(sc);
	
	}
}
