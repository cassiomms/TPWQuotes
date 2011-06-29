package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

//Juros

@Entity
@Table(name="tInterest")
public class Interest implements java.io.Serializable
{
	@Id
	@Column(name="date", unique=true, nullable=false)
	private Date date;
	
	@Column(name="value", nullable=false)
	private Float value;
	
	public void setDate(Date date) { this.date = date; }
	public void setValue(Float value) { this.value = value; }
	
	public Date getDate() { return this.date; }
	public Float getValue() { return this.value; }
	
}
