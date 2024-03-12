package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import in.cjctech.wonderhomeapp.app.model.Ledger;

public interface LedgerService {

	public Ledger saveLedger(Ledger ledger);

	public List<Ledger> getLedger();

}
