package tpwquotes.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;



@Embeddable
public class BalancePk implements Serializable 
{	
  private User user;
	private Timestamp tmsp;
		
	public BalanceKey() {}
	
	@ManyToOne
  @JoinColumn(nullable = false, updatable = false, insertable = false)
	public User getUser() { return this.user; }
	public void setUser(User user) { this.user = user; }

	public Timestamp getTimestamp() { return tmsp; }
	public void setTimestamp(Timestamp tmsp) { this.tmsp = tmsp; }
}
