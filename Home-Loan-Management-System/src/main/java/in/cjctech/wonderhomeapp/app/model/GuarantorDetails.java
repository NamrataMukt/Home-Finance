package in.cjctech.wonderhomeapp.app.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GuarantorDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guarantorId;
	private String guarantorName;
	private String guarantorDOB;
	private String guarantorRelationshipWithApplicant;
	private long guarantorMobileNumber;
	private long aadhaarcardNumber;
	private String guarantorCityName;
	private String guarantorJobDetails;
	private String guarantorAreaName;
	private byte adhaar;
	
}
