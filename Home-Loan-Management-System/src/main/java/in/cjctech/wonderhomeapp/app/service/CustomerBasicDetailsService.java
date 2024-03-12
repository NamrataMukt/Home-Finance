package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import in.cjctech.wonderhomeapp.app.model.CustomerBasicDetails;

public interface CustomerBasicDetailsService {

	public CustomerBasicDetails saveCustomerData(CustomerBasicDetails cbd);

	public List<CustomerBasicDetails> getAll();

}
