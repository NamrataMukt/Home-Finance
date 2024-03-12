package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.Ledger;
import in.cjctech.wonderhomeapp.app.service.LedgerService;

@RestController
public class LedgerController 
{
	@Autowired
	private LedgerService ls;
	
	@PostMapping("/createLedger")
	public ResponseEntity<Ledger>createLedger(@RequestBody Ledger ledger)
	{
		Ledger l=ls.saveLedger(ledger);
		return new ResponseEntity<Ledger>(l,HttpStatus.CREATED);
	}

	@GetMapping("/getLedger")
	public ResponseEntity<List<Ledger>>getLedger()
	{
		List<Ledger> ledger=ls.getLedger();
		return new  ResponseEntity<List<Ledger>>(ledger,HttpStatus.OK);
	}
}
