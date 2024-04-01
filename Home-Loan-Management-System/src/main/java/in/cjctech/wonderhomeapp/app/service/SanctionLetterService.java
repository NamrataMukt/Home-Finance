package in.cjctech.wonderhomeapp.app.service;


import java.util.List;

import in.cjctech.wonderhomeapp.app.model.SanctionLetter;

public interface SanctionLetterService 
{

	public SanctionLetter saveSanctionLetter(SanctionLetter s);

	public List<SanctionLetter> getAll();

	public SanctionLetter findbysid(long sid);

	

	public void getDataBysanctionId(long id);

}
