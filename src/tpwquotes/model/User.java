package tpwquotes.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;



@Entity
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
	
<<<<<<< Updated upstream
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setName(String name) { this.name = name; }
	public void setEmail(String email) { this.email = email; }
	public void setPassword(String password) { this.password = password; }
	public void setPhoto(String photo) { this.photo = photo; }
	public void setPhone(String phone) { this.phone = phone; }
=======
	public User() {}
>>>>>>> Stashed changes
	
	@Id
	public setId(String id) { this.id = id; }
	public String getId() { return this.id; }

	@Column(nullable=false)	
	public setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	@Column(nullable=false)
	public setEmail(String email) { this.email = email; }
	public String getEmail() { return this.email; }

	@Column(nullable=false)
	public setPassword(String password) { this.password = password; }
	public String getPassword() { return this.password; }

	@Column
	public setPhoto(String photo) { this.photo = photo; }
	public String getPhoto() { return this.photo; }

	@Column(nullable=false)
	public setPhone(String phone) { this.phone = phone; }
	public String getPhone() { return this.phone; }
	
	@OneToMany
	@JoinColumn (name="user_id")
	public Set<Transaction> getTransactions() { return this.transactions; }	
	public void setTransactions(Set<Transaction> transactions) { this.tranctions = transactions; }
		
	@OneToMany
	@JoinColumn (name="user_id")
	public Set<Balance> getBalances() { return this.balances; }
	public void setBalances(Set<Balance> balances) { this.balances = balances; }
}
