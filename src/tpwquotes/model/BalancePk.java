package tpwquotes.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;



@Embeddable
public class BalancePk implements Serializable 
{	
  private User user;
	private Date tmsp;
		
	//public BalacePk() {}
	
	@ManyToOne
  @JoinColumn(nullable = false, updatable = false, insertable = false)
	public User getUser() { return this.user; }
	public void setUser(User user) { this.user = user; }

  @Temporal(TemporalType.TIMESTAMP)
	public Date getDate() { return tmsp; }
	public void setDate(Date tmsp) { this.tmsp = tmsp; }
}
