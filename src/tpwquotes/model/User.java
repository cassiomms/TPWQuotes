package tpwquotes.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;



@Entity
@Table(name="user_tb")
public class User implements Serializable
{
	private String id;
	private String name;
	private String email;
	private String password;
  private String photo;
	private String phone;
	private Set<Transaction> transactions = new HashSet<Transaction>();
	private Set<Balance> balances = new HashSet<Balance>();
	
	public User() {}

	@Id
	public void setId(String id) { this.id = id; }
	public String getId() { return this.id; }

	@Column(nullable=false)	
	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	@Column(nullable=false)
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
	
	@OneToMany
	@JoinColumn (name="user_id")
	public Set<Transaction> getTransactions() { return this.transactions; }	
	public void setTransactions(Set<Transaction> transactions) { this.transactions = transactions; }
		
	@OneToMany
	@JoinColumn (name="user_id")
	public Set<Balance> getBalances() { return this.balances; }
	public void setBalances(Set<Balance> balances) { this.balances = balances; }
}
