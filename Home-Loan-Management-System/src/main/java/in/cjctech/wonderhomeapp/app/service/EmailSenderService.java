package in.cjctech.wonderhomeapp.app.service;


import in.cjctech.wonderhomeapp.app.model.*;

public interface EmailSenderService {

public	boolean sendMail(EmailSender es);

public CustomerBasicDetails getid(Long eid);

}
