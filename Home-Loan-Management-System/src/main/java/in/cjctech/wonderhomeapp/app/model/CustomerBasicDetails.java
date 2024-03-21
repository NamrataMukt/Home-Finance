package in.cjctech.wonderhomeapp.app.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
	private String gender;
	@Temporal(TemporalType.DATE)
	private Date customerDOB;
	private int age;
	private long  adharNumber;
	private String pancardNumber;
	private int cibilScore;
	private String cibilScoreStatus;
	private long tokenmoney;
	private long loanRequired;
		
}
