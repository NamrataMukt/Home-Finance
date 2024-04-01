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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ledger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ledgerId;
	@Temporal(TemporalType.DATE)
	private Date ledgerCreatedDate;
	private long loannumber;
	private String customername;
	private double totalLoanAmount;
	private double payableAmountWithInterest;
	private int tenure;
	private double monthlyEmi;
	private double amountPaidTillDate;
	private double remainingAmount;
	@Temporal(TemporalType.DATE)
	private Date emiPayDate;
	private int defaulterCount;
	private String loanStatus; 

}
/*
{
	"ledgerCreatedDate":"2024-04-10",
	"totalLoanAmount":900000,
	"payableAmountWithInterest":1300000,
	"tenure":3,
	"monthlyEmi":4000,
	"amountPaidTillDate":400000,
	"remainingAmount":900000,
	"nextEmiDateStart":"2024-05-11",
	"nextEmiDateEnd":"2024-06-12",
	"defaulterCount":3,
	"previousEmiStatus":"payed",
	"currentMonthEmiStatus":"payed",
	"loanEndDate":"2026-11-07",
	"loanStatus":"done"

}
*/
