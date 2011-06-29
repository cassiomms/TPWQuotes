package tpwquotes.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;



@Entity
public class Balance implements Serializable 
{
	private BalancePk id;
	private Float fund;
	private Float debt;
	
	@Id
<<<<<<< Updated upstream
	@Column(name="bk", nullable=false, unique=true)
	private BalanceKey bk;

	@Column(name="funds",nullable=false)
	private Float funds;
	public Float getFunds() { return this.funds;}
	public void setFunds(Float funds) { this.funds = funds; }
	
	@Column(name="debt",nullable=false)	
	private Float debt;
	public Float getDebt() { return this.debt;}
	public void setDebt(Float debt) { this.debt = debt; }

	public Balance() {}
=======
	public BalancePk getId() { return id; }
	public void setId(BalancePk id) { this.id = id; }
	
	@Column(nullable=false);
	public Float getFund() { return funds;}
	public void setFund(Float fund) { this.fund = fund; }
	
	@Column(nullable=false);	
	public Float getDebt() { return debt;}
	public void setDebt(Float debt) { this.debt = debt; }
>>>>>>> Stashed changes
}
