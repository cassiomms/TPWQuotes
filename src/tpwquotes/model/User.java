package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tUser")
public class User implements java.io.Serializable
{
	@Id
	@Column(name="cpf", unique=true, nullable=false)
	private String cpf;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="photo", nullable=true)
	private String photo;
	
	@Column(name="phone", nullable=true)
	private String phone;
	
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setName(String name) { this.name = name; }
	public void setEmail(String email) { this.email = email; }
	public void setPassword(String password) { this.password = password; }
	public void setPhoto(String photo) { this.photo = photo; }
	public void setPhone(String phone) { this.phone = phone; }
	
	public String getCpf() { return this.cpf; }
	public String getName() { return this.name; }
	public String getEmail() { return this.email; }
	public String getPassword() { return this.password; }
	public String getPhoto() { return this.photo; }
	public String getPhone() { return this.phone; }
	
	@OneToMany
	@JoinColumn (name="cpf")
	private Set<Transaction> transactions = new HashSet<Transaction>();
	public Set<Transaction> getTransactions() { return this.transactions; }	
	
	@OneToMany
	@JoinColumn (name="cpf")
	private Set<Balance> balances = new HashSet<Balance>();
	public Set<Balance> getBalances() { return this.balances; }
	
	
	
}
