package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Wallet implements Serializable 
{
	@Id
	private WalletPk id;
	private Integer quantity;
	
	public Wallet() {}
	
	public WalletPk getId() { return id; }
	public void setId(WalletPk id) { this.id = id; }
	
	@Column(nullable=false)	
	public Integer getQuantity() { return quantity; }
	public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
