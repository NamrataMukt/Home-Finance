package in.cjctech.wonderhomeapp.app.utility;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import in.cjctech.wonderhomeapp.app.model.CustomerBasicDetails;
import in.cjctech.wonderhomeapp.app.model.EmailSender;
import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.repository.EmailSenderRepository;
import in.cjctech.wonderhomeapp.app.repository.SanctionLetterRepository;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class EmailHelper {
	
	@Autowired private JavaMailSender sender;
	@Autowired private EmailSenderRepository emailSenderRepository;
	@Autowired private SanctionLetterRepository sanctionLetterRepository;
	@Value("${spring.mail.username}") private static String fromMail;
	
	private final static String format1 = "Dear";
	private final static String format2 = "We are delighted to inform you that your loan application has been successfully approved by [Bank Name]. Congratulations on this significant milestone!\r\n\r\n";
	private final static String loanDetails = "Loan Id: ";
	private final static String format3 = "Loan Amount: ";
	private final static String format4 = "Interest Rate: ";
	private final static String format5 = "Loan Tenure: \r\n";
	private final static String format6 = "Monthly EMI Amount: \r\n";
	private final static String format7 = "Please review the attached documents, which outline the terms and conditions of your loan agreement. It's essential to thoroughly read through the details to ensure clarity and understanding.\r\n\r\n"
	        + "Should you have any questions or require further clarification, please don't hesitate to contact our customer service team at 199 or reply to this email directly.\r\n\r\n"
	        + "We appreciate your trust in Wonder Home Finance, and we are committed to assisting you throughout your loan journey. We look forward to being part of your financial success.\r\n\r\n"
	        + "Thank you for choosing Wonder Home Finance. Congratulations again on your approved loan!\r\n\r\n"
	        + "Best regards,\r\n\r\n"
	        + "[Your Name]\r\n"
	        + "[Your Position]\r\n"
	        + "Wonder Home Finance\r\n"
	        + "7755995420";
//for Reject
	private final static String rejecttext="\r\n"
			+ "We regret to inform you that your recent loan application with Wonder Home Finance has been declined. After careful consideration and review of your application, we have determined that we are unable to approve the requested loan at this time.\r\n"
			+ "\r\n"
			+ "We understand that this news may be disappointing, and we want to assure you that our decision was not made lightly. Factors such as credit history, income stability, and current financial obligations all play a significant role in our evaluation process.\r\n"
			+ "\r\n"
			+ "If you have any questions or would like further clarification regarding our decision, please do not hesitate to contact our customer service team at [Customer Service Number]. We are here to assist you and provide any additional information you may need.\r\n"
			+ "\r\n"
			+ "Thank you for considering Wonder Home Finance for your financial needs. We appreciate the opportunity to review your application and wish you the best in your future endeavors.\r\n"
			+ "\r\n"
			+ "Sincerely,\r\n"
			+ "\r\n"
			+ "[Your Name]\r\n"
			+ "[Your Position]\r\n"
			+ "Wonder Home Finance\r\n"
			+ "7755995420";

	
	public boolean emailsendComponent(SanctionLetter s, boolean es2) {
		
			// TODO Auto-generated method stub
			try {
				System.out.println(s.getApplicantemailid() +"  "+s.getLoanAmountSanctioned());
				
				EmailSender es = new EmailSender();
				es.setToMail(s.getApplicantemailid());
				SimpleMailMessage mail;
			if (es2) {
				mail=new SimpleMailMessage();
				mail.setTo(es.getToMail());
				es.setSubject("Congratulations! Your Loan Application Has Been Approved\r\n"
						+ "");
				mail.setFrom(fromMail);
				mail.setSubject(es.getSubject());
				final String mailText = format1 + s.getApplicantName() + ",\r\n\r\n" +
                        format2 + "\r\n" +
                        loanDetails + ": " + Long.toString(s.getSanctionId()) + "\r\n" +
                        format3 + ": " + Double.toString(s.getLoanAmountSanctioned()) + "\r\n" +
                        format4 + ": " + Float.toString(s.getRateOfInterest()) + "\r\n" +
                        format5 + ": " + Integer.toString(s.getLoanTenure()) + "\r\n" +
                        format6 + ": " + Double.toString(s.getMonthlyEmiAmount()) + "\r\n\r\n" +
                        format7;
			//	System.out.println(mailText);
				es.setText(mailText);
				mail.setText(es.getText());
				sender.send(mail);
			}
			else {
				mail=new SimpleMailMessage();
				mail.setTo(es.getToMail());
				es.setSubject("Rejection ! Your Loan Application\r\n"
						+ "");
				mail.setFrom(fromMail);
				mail.setSubject(es.getSubject());
				es.setText(format1.concat(s.getApplicantName()).concat(rejecttext));
				mail.setText(es.getText());
				sender.send(mail);
			} 
			return true;	
			} catch(Exception e) {
				
				
				log.info("exception Occurs", e);
				//return false;
			}
			return false;
		}

}
