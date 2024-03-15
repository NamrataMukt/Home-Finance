package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.Mortage;


public interface MortageService {

	public Mortage addMortage(String mortage, MultipartFile propertyproof);

	public List<Mortage> getAllMortage();

}
