package in.cjctech.wonderhomeapp.app.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enquiry implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long applicantId;
	private String applicantName;
	private byte age;
	private String email;
	private long mobileNumber;
	private String pancardNumber;
	private String city;
	private int pincode;
	@Temporal(TemporalType.DATE)
	private Date date;  
	private String enquiry;
	@OneToOne(cascade = CascadeType.MERGE)
	private CibilScore cibilScore;
	
}
