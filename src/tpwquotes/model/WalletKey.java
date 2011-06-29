package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;


public class WalletKey implements java.io.Serializable {
	
	@ManyToOne
        @JoinColumn (name="code", nullable = false, updatable = false, insertable = false)
	private Quote quote;
	public Quote getQuote() { return this.quote; }
	public void setQuote(Quote quote) { this.quote = quote; }
	
	@ManyToOne
        @JoinColumn (name="cpf", nullable = false, updatable = false, insertable = false)
	private User user;
	public User getUser() { return this.user; }
	public void setUser(User user) { this.user = user; }
	
		
	public WalletKey() {}
	
}
