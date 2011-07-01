package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;



@Entity
public class Tick implements java.io.Serializable 
{
	private TickPk id;
	private Float value;

	public Tick() {}

	@Id
  	public TickPk getId() { return id; }
  	public void setId(TickPk id) { this.id = id; }
	
	@Column(nullable=false)
	public Float getValue() { return this.value;}
	public void setValue(Float value) { this.value = value; }	
}

