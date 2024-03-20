package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.service.OperationManagerService;

@CrossOrigin("*")
@RestController
public class OprationManagerController {
	@Autowired
	private OperationManagerService ms;
	
	@GetMapping("/view_Enquiry")
    public ResponseEntity<List<Enquiry>> getAllEnquiry(){
        List<Enquiry> allEnquiries = ms.getAllEnquiry();
        return new ResponseEntity<>(allEnquiries, HttpStatus.OK);
    }

}
