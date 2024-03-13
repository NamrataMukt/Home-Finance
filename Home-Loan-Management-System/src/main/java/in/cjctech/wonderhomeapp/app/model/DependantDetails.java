package in.cjctech.wonderhomeapp.app.model;

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
public class DependantDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dependantId;
	private String fatherName;
	private String motherName;
	private String maritalStatus;
	private int numberOfChild;
	private double familyIncome;
	private String spouseName;
	private int noOfFamilyMember;

}


//{
//	"fatherName":"Mno",
//	"motherName":"xyz",
//	"maritalStatus":"unmarried",
//	"numberOfChild":0,
//	"familyIncome":4646576,
//	"spouseName":"no",
//	"noOfFamilyMember":4
//	
//	
//	
//	
//}