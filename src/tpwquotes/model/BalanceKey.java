package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;


public class BalanceKey implements java.io.Serializable {
	
	private Date date;
	
	public Date getDate() { return this.date;}
	public void setDate(Date date) { this.date = date; }
	
	@ManyToOne
        @JoinColumn (name="cpf", nullable = false, updatable = false, insertable = false)
	private User user;
	public User getUser() { return this.user; }
	public void setUser(User user) { this.user = user; }
	
		
	public BalanceKey() {}
	
}
