package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.Ledger;
import in.cjctech.wonderhomeapp.app.repository.LedgerRepository;
import in.cjctech.wonderhomeapp.app.service.LedgerService;

@Service
public class LedgerServiceImpl implements LedgerService
{

	@Autowired
	private LedgerRepository lr;
	
	@Override
	public Ledger saveLedger(Ledger ledger) 
	{
		return lr.save(ledger);
	}

	@Override
	public List<Ledger> getLedger()
	{
		
		return lr.findAll();
	}
    
}
