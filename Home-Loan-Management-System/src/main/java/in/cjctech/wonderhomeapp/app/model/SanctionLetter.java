package in.cjctech.wonderhomeapp.app.model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SanctionLetter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sanctionId;
	@Temporal(TemporalType.DATE)
	private Date sanctionDate;
	private String applicantName;
	private String contactDetails;
	private String applicantemailid;
	private long tokenamountForHome;
	private double loanAmountSanctioned;
	private float rateOfInterest;
	private int loanTenure;
	private double monthlyEmiAmount;
	private String sanctionstatus;
}

//{
//	"sanctionDate":"12-03-2024",
//	"applicantName":"Am",
//	"contactDetails":"cel",
//	"applicantemailid":"am@gmail.com",
//	"tokenamountForHome":20000,
//	"loanAmountSanctioned":900000,
//	"rateOfInterest":7,
//	"loanTenure":12,
//	"monthlyEmiAmount":10000,
//	"sanctionstatus":app
//
//
//}
