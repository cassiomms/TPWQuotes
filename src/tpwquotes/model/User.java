package tpwquotes.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;



@Entity
@Table(name="user_tb")
public class User implements Serializable
{
	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private String photo;
	private String phone;
	private Float funds;
	private Float debt;
	
	
	
	public User() {}

	//@Id
	public void setId(String id) { this.id = id; }
	public String getId() { return this.id; }

	@Column(nullable=false)	
	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	@Column(nullable=false,unique=true)
	public void setEmail(String email) { this.email = email; }
	public String getEmail() { return this.email; }

	@Column(nullable=false)
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return this.password; }

	@Column
	public void setPhoto(String photo) { this.photo = photo; }
	public String getPhoto() { return this.photo; }

	@Column(nullable=false)
	public void setPhone(String phone) { this.phone = phone; }
	public String getPhone() { return this.phone; }
	
	@Column(nullable=false)
	public void setFunds(Float funds) { this.funds = funds; }
	public Float getFunds() { return this.funds; }
	
	@Column(nullable=false)
	public void setDebt(Float debt) { this.debt = debt; }
	public Float getDebt() { return this.debt; }
	
	@OneToMany
	@JoinColumn (name="seller_id")
	private Set<Transaction> stransactions = new HashSet<Transaction>();
	public Set<Transaction> getSTransactions() { return this.stransactions; }	
	public void setSTransactions(Set<Transaction> stransactions) { this.stransactions = stransactions; }
	
	@OneToMany
	@JoinColumn (name="buyer_id")
	private Set<Transaction> btransactions = new HashSet<Transaction>();
	public Set<Transaction> getBTransactions() { return this.btransactions; }	
	public void setBTransactions(Set<Transaction> btransactions) { this.btransactions = btransactions; }
		
	@OneToMany
	@JoinColumn (name="user_id")
	private Set<Balance> balances = new HashSet<Balance>();
	public Set<Balance> getBalances() { return this.balances; }
	public void setBalances(Set<Balance> balances) { this.balances = balances; }
	
	@OneToMany
	@JoinColumn (name="user_id")
	private Set<Wallet> wallet = new HashSet<Wallet>();
	public Set<Wallet> getWallet() { return this.wallet; }
	public void setWallet(Set<Wallet> wallet) { this.wallet = wallet; }
}
