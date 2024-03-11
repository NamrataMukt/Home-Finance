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
public class Mortage 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mortageId;
	private double propertyValue;
	private byte[] propertyProof;
	private byte[] propertyInsurance;
	private String propertyType;
	private double loanOnProperty;
	private long reraNumber; 
	

}
