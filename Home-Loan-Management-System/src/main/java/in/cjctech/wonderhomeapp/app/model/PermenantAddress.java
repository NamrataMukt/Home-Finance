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
public class PermenantAddress
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int permenantId;
	private String houseNo;
	private String areaName;
	private String streetName;
	private String cityName;
	private String district;
	private String state;
	private int pincode;

}
