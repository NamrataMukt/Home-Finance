package in.cjctech.wonderhomeapp.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerApplicationForm 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long applicationNumber;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private CustomerBasicDetails cutomerDetails;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private DependantDetails applicantDependant;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private EmploymentDetails employmentDetails;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Mortage mortage;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private GuarantorDetails guarantorDetails;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private  CustomerBankDetails  customerbankDetail;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private BuilderDetails builderdetails;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private CustomerDocumentUpload documentUpload;
	
	
	
}
