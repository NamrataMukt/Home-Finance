package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.repository.OperationManagerRepository;
import in.cjctech.wonderhomeapp.app.service.OperationManagerService;

@Service
public class OperationManagerServiceimpl implements OperationManagerService {
    
	@Autowired
	private OperationManagerRepository mr;
	
	public List<Enquiry> getAllEnquiry() {
		List<Enquiry> list = mr.findAll();
		return list;			
	}

}
