package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tWallet")
public class Wallet implements java.io.Serializable {
	@Id
	@Column(name="wk", nullable=false, unique=true)
	private WalletKey wk;

	@Column(name="quantity",nullable=false)
	private Integer quantity;
	public Integer getQuantity() { return this.quantity;}
	public void setQuantity(Integer quantity) { this.quantity = quantity; }

	public Wallet() {}
}
