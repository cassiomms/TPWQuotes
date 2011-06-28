package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;




@Entity
@Table(name="tTick")
public class Tick implements java.io.Serializable {
	@Id
	@Column(name="tk", nullable=false,unique=true)
	private TickKey tk;
	
	@Column(name="value", nullable=false)
	private Float value;

	public Tick() {}
	
	public Float getValue() { return this.value;}
	public void setValue(Float value) { this.value = value; }
	
}

