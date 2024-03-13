package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.service.CibilService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CibilController {
	
	@Autowired
	 CibilService cs;
	
	@PostMapping("/save_cibilscore")
	public ResponseEntity<CibilScore> saveCibilScore(@RequestBody CibilScore cibilscore){
		
		
		CibilScore cibil =cs.addCibilScore(cibilscore);
		return new ResponseEntity<CibilScore>(cibilscore, HttpStatus.OK);
		
		

}
}
