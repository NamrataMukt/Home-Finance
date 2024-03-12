package in.cjctech.wonderhomeapp.app.model;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CibilScore
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cibilId;
	private int cibilScore;
	private String cibilScoreDate;
	private long status;

}
