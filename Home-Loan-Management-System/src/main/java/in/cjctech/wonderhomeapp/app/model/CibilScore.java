package in.cjctech.wonderhomeapp.app.model;


import java.util.Date;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
	@Temporal(TemporalType.DATE)
	private Date cibilScoreDate;
	private String status;
}
