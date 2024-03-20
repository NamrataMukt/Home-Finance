package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.GuarantorDetails;

public interface GuarantorDetailsService 
{



public GuarantorDetails saveGurantorDetails(String gurantor, MultipartFile Gaadhar);

public List<GuarantorDetails> getAllGurantor();

}
