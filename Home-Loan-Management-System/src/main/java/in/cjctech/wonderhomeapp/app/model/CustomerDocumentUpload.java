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

public class CustomerDocumentUpload 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long documentId;
	
	@Lob
	@Column(length=999999999)
	private byte[] aadharCard;
	
	@Lob
	@Column(length=999999999)
	private byte[] panCard;
	
	@Lob
	@Column(length=999999999)
	private byte[] addressProof;
	
	@Lob
	@Column(length=999999999)
	private byte[] bankCheque;
	
	@Lob
	@Column(length=999999999)
	private byte[] applicantPhoto;
	
	@Lob
	@Column(length=999999999)
	private byte[] applicantSignature;
	

	@Lob
	@Column(length=999999999)
	private byte[] incometaxReturn;
	
	@Lob
	@Column(length=999999999)
	private byte[] bankStatment;
	
	

}
