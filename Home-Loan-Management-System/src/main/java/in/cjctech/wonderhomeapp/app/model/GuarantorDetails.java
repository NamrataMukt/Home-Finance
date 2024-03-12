package in.cjctech.wonderhomeapp.app.model;


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
public class GuarantorDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guarantorId;
	private String guarantorName;
	@Temporal(TemporalType.DATE)
	private String guarantorDOB;
	private String guarantorRelationshipWithApplicant;
	private long guarantorMobileNumber;
	private long aadhaarcardNumber;
	private String guarantorCityName;
	private String guarantorJobDetails;
	private String guarantorAreaName;
	@Lob
	@Column(length=99999999)
	private byte[] adhaar;
	
}
