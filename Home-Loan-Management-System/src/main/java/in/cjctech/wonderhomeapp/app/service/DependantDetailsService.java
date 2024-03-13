package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import in.cjctech.wonderhomeapp.app.model.DependantDetails;

public interface DependantDetailsService
{

	public DependantDetails saveDependantDetails(DependantDetails dd);

	public List<DependantDetails> getDependantDetails();
	

}
