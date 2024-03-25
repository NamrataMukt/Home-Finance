package in.cjctech.wonderhomeapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cjctech.wonderhomeapp.app.model.CibilScore;
import in.cjctech.wonderhomeapp.app.model.Enquiry;
import in.cjctech.wonderhomeapp.app.service.EnquiryService;

@CrossOrigin("*")
@RestController

public class EnquiryController 
{
	@Autowired private EnquiryService es;
	
	@PostMapping("/Customers")
	public ResponseEntity<Enquiry> createEnquiry(@RequestBody Enquiry enquiry)
	{
		Enquiry enq= es.addEnquiry(enquiry);
		return new ResponseEntity<Enquiry>(enq,HttpStatus.CREATED);
		
	}

    @PutMapping("/updateEnquiry/{customerId}")
    public ResponseEntity<Enquiry> updateEnquiry(@PathVariable long customerId, @RequestBody Enquiry updatedEnquiry) {
        Enquiry updatedEnquiryResult = es.updateEnquiry(customerId,updatedEnquiry);
        return ResponseEntity.ok(updatedEnquiryResult);
    }
    
  
    
    @GetMapping("cibil/{customerId}")
    public ResponseEntity<Enquiry> getCibilScore(@PathVariable Long customerId) {
        Enquiry cibilScore = es.getCibilScoreByApplicantId(customerId);
       
            return ResponseEntity.ok(cibilScore);
    }
    
    @DeleteMapping("/Customers/{customerId}")
    public ResponseEntity<?> deleteEnquiry(@PathVariable Long customerId) {
        try {
            es.deleteEnquiry(customerId);
            return ResponseEntity.ok("Enquiry with ID " + customerId + " deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Failed to delete enquiry with ID " + customerId + ": " + e.getMessage());
        }
    }
    
    @PutMapping("/updateEnquiryStatus/{customerId}")
    public ResponseEntity<?> updateEnquiryStatus(@PathVariable long customerId) {
        try {
            // Retrieve the enquiry by its ID
            Enquiry updatedEnquiry = es.getEnquiryById(customerId);
            if (updatedEnquiry == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Enquiry not found with ID " + customerId);
            }

            // Check if the CIBIL score is available
            CibilScore cibilScore = updatedEnquiry.getCibilScore();
            if (cibilScore == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("CIBIL score is not available for enquiry with ID " + customerId);
            }

            // Update the status based on the CIBIL score
            if (cibilScore.getCibilScore() >= 700) {
            	updatedEnquiry.setStatus("Approved");
            } else {
            	updatedEnquiry.setStatus("Rejected");
            }

            // Save the updated enquiry
            es.updateEnquiry(customerId,updatedEnquiry);

            return ResponseEntity.ok("Enquiry status updated successfully for ID " + customerId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Failed to update enquiry status for ID " + customerId + ": " + e.getMessage());
        }
    }
    
    

}
