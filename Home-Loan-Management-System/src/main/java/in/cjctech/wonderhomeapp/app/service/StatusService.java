package in.cjctech.wonderhomeapp.app.service;

import in.cjctech.wonderhomeapp.app.model.StatusCheck;

public interface StatusService {

	public StatusCheck addStatus(long customerId, StatusCheck sc);

}
