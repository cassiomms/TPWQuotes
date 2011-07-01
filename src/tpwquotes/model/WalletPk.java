package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;


public class WalletPk implements Serializable 
{	
	private Quote quote;
  private User user;
	
	//public WalletPk() {}

	@ManyToOne
  	@JoinColumn (name="code", nullable = false, updatable = false, insertable = false)
	public Quote getQuote() { return quote; }
	public void setQuote(Quote quote) { this.quote = quote; }
	
	@ManyToOne
 	@JoinColumn(nullable = false, updatable = false, insertable = false)
	public User getUser() { return this.user; }
	public void setUser(User user) { this.user = user; }
}
