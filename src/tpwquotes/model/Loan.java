package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@DiscriminatorValue("loan")
public class Loan extends Transaction implements java.io.Serializable
{
	@Column(name="value", nullable=false)
	private Float value;
	
	public Loan() {}

	public Float getValue() { return this.value; }
	public void setValue(Float value) { this.value = value; }	
}
