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
	public BalancePk getId() { return id; }
	public void setId(BalancePk id) { this.id = id; }
	
	@Column(nullable=false)
	public Float getFund() { return fund;}
	public void setFund(Float fund) { this.fund = fund; }
	
	@Column(nullable=false)	
	public Float getDebt() { return debt;}
	public void setDebt(Float debt) { this.debt = debt; }
}
