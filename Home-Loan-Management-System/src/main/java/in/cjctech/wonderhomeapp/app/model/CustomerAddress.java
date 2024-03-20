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
public class CustomerAddress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerAddressId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PermenantAddress permenantAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LocalAddress localAddress;
	
}


