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
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerBasicDetails cutomerDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DependantDetails applicantDependant;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmploymentDetails employmentDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails previousloandata;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Mortage mortage;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private  CustomerBankDetails  customerbankDetail;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BuilderDetails builderdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDocumentUpload documentUpload;
	
	
	
}
