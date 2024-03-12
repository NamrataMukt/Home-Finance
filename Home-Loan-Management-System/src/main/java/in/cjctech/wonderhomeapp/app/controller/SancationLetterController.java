package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;

@RestController
public class SancationLetterController 
{
		@Autowired 
		SanctionLetterService ss;
		
		
		@PostMapping("/savesanctionletter")
		public ResponseEntity<SanctionLetter> saveSanction(@RequestBody SanctionLetter s)
		{
			SanctionLetter s1=ss.saveSanctionLetter(s);
			return new ResponseEntity<SanctionLetter>(s1,HttpStatus.CREATED);
		}
		
		@GetMapping("/getAllsanctionLetter")
		public ResponseEntity<List<SanctionLetter>> getAllData()
		{
			List<SanctionLetter> list1=ss.getAll();
			return new ResponseEntity<>(list1,HttpStatus.OK);
		}

}
