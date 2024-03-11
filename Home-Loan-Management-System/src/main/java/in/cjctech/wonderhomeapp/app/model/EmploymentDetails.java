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
public class EmploymentDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long professionId;
	private String companyName;
	private double salary;
	private String employeeWorkingPeriod;
	private String professionDesignation;
	private byte[] salarySlip;
	

}
