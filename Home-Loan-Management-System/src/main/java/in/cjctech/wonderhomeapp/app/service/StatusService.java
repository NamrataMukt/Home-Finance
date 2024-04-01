package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import in.cjctech.wonderhomeapp.app.model.StatusCheck;

public interface StatusService {

	public StatusCheck addStatus(long applicantno, String status);

	public List<StatusCheck> findStatus();


	

	

}
