package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;


public class TickPk implements Serializable 
{	
  private Quote quote;
	private Date date;
	
	public TickPk() {}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() { return this.date;}
	public void setDate(Date date) { this.date = date; }
	
	@ManyToOne
  	@JoinColumn (nullable = false, updatable = false, insertable = false)
	public Quote getQuote() { return this.quote; }
	public void setQuote(Quote quote) { this.quote = quote; }
}
