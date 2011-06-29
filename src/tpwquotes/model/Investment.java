package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@DiscriminatorValue("investment")
public class Investment extends Transaction implements java.io.Serializable
{
	@Column(name="value", nullable=false)
	private Float value;
	
	@Column(name="code", nullable=false)
	private String code;
	
	@Column(name="quantity", nullable=false)
	private Integer quantity;
	
	public void setDate(Float value) { this.value = value; }
	public void setCode(String code) { this.code = code;}
	public void setQuantity(Integer quantity) { this.quantity = quantity; }
	
	public Float getValue() { return this.value; }
	public String getCode() { return this.code; }
	public Integer getQuantity() { return this.quantity; }	
		public Investment() {}
	
}
