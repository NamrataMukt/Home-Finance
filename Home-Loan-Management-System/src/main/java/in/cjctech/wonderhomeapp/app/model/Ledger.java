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
public class Ledger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ledgerId;
	private String ledgerCreatedDate;
	private double totalLoanAmount;
	private double payableAmountWithInterest;
	private int tenure;
	private double monthlyEmi;
	private double amountPaidTillDate;
	private double remainingAmount;
	private String nextEmiDateStart;
	private String nextEmiDateEnd;
	private int defaulterCount;
	private String previousEmiStatus;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;

}
