package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;


public class TickKey implements java.io.Serializable {
	
	private Date date;
	
	public TickKey() {}
	
	public Date getDate() { return this.date;}
	public void setDate(Date date) { this.date = date; }
	
	@ManyToOne
        @JoinColumn (name="code", nullable = false, updatable = false, insertable = false)
	private Quote quote;
	public Quote getQuote() { return this.quote; }
	public void setQuote(Quote quote) { this.quote = quote; }
	
}
