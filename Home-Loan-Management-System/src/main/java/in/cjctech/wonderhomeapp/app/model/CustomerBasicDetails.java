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
public class CustomerBasicDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	private String customerName;
	private long customerMobileNumber;
	private String customerEmailId;
	private long  adharNumber;
	private String pancardNumber;
	private String gender;
	@Temporal(TemporalType.DATE)
	private String customerDOB;
	private int age;
	private String loanType;
	private String maritalStatus;
	private String statusCode;
	private double totalLoanRequired;
	private int cibilScore;
	
}
