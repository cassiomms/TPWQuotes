package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tAd")
public class Ad implements java.io.Serializable {
	@Id
	@Column(name="aid", unique=true, nullable=false)
	@SequenceGenerator(name = "seq_aid", sequenceName = "seq_aid")
        @GeneratedValue(strategy=GenerationType.AUTO, generator="seq_aid")
        
        @ManyToOne
        @JoinColumn (name="code", nullable = false, updatable = false, insertable = false)
	private Quote quote;
	public Quote getQuote() { return this.quote; }
	public void setQuote(Quote quote) { this.quote = quote; }
        
        @ManyToOne
        @JoinColumn (name="cpf", nullable = false, updatable = false, insertable = false)
	private User seller;
	public User getSeller() { return this.quote; }
	public void setSeller(User seller) { this.seller = seller; }
        
	@Column(name="quantity", nullable=false)
	private Integer quantity;
	@Column(name="price", nullable=false)
	private Float price;

	public Ad() {}

	public Integer getQuantity() { return this.quantity;}
	public void setQuantity(Integer quantity) { this.quantity = quantity; }
		
	public Float getPrice() { return this.price;}
	public void setPrice(Float price) { this.price = price; }
	
}
