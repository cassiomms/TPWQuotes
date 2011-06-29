package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tBalance")
public class Balance implements java.io.Serializable {
	@Id
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
}
