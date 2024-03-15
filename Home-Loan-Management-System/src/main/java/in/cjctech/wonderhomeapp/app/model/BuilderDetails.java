package in.cjctech.wonderhomeapp.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BuilderDetails 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long builderId;
	private String builderName;
	private long builderaAdharcard;
	private String builderPancard;
	private String builderaddress;
	private String bankName;
	private long bankAccno;
	private String bankIfscCode;
	@Lob
	@Column(length=999999999)
	private byte[] panCard;
	
	@Lob
	@Column(length=999999999)
	private byte[] aadharCard;
	
 }
