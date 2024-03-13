package in.cjctech.wonderhomeapp.app.model;

import java.io.Serializable;

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
public class EmployeeForm 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empUserName;
	private String empUserPassword;
	private String email;
	private Long mobileNumber;
	private String designation;

}


//{
//	"empUserName":"amit",
//	"empUserPassword":"132",
//	"email":"amit@gmail.com",
//	"mobileNumber":42553533
//	
//	
//}
