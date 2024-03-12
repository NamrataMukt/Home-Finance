package in.cjctech.wonderhomeapp.app.model;

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
	private String sanctionDate;
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
