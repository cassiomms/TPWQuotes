package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tQuote")
public class Quote implements java.io.Serializable {
	@Id
	@Column(name="code", nullable=false, unique=true)
	private String code;
	@Column(name="name", nullable=false)
	private String name;
	@Column(name="profile", nullable=false)
	private String profile;

	public Quote() {}

	public String getCode() { return this.code;}
	public void setCode(String code) { this.code = code; }
		
	public String getName() { return this.name;}
	public void setName(String name) { this.name = name; }
	
	public String getProfile() { return this.profile;}
	public void setProfile(String profile) { this.profile = profile; }
	
	@OneToMany
	@JoinColumn (name = "code")
	private Set<Tick> ticks = new HashSet<Tick>();
	public Set<Tick> getTicks() { return this.ticks; }		
	public void setTicks(Set<Tick> ticks) {this.ticks = ticks;}
}
