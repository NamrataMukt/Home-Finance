package in.cjctech.wonderhomeapp.app.service;

import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.CustomerDocumentUpload;

public interface CustomerDocumnetService 
{
	public CustomerDocumentUpload saveDocumnet(MultipartFile pan, MultipartFile aadhar, MultipartFile address,
			MultipartFile cheque, MultipartFile photo, MultipartFile sign, MultipartFile tax, MultipartFile statment);

}
