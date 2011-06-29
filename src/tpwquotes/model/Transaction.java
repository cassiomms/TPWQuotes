package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

//Juros

@Entity
@Table(name="tTransaction")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="transtype",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue("transaction")
public class Transaction implements java.io.Serializable
{
	@Id
	@Column(name="tid", unique=true, nullable=false)
	@SequenceGenerator(name = "seq_tid", sequenceName = "seq_tid")
        @GeneratedValue(strategy=GenerationType.AUTO, generator="seq_tid")
	private Long tid;
	
	@Column(name="date", nullable=false)
	private Date date;
	
	public void setDate(Date date) { this.date = date; }
	
	public Date getDate() { return this.date; }
	
	
	@ManyToOne
        @JoinColumn (name="cpf", nullable = false, updatable = false, insertable = false)
	private User seller;  //USUARIO QUE ESTÁ VENDENDO (ou o banco num emprestimo)
	public User getSeller() { return this.seller; }
	public void setSeller(User seller) { this.seller = seller; }
	
	@ManyToOne
        @JoinColumn (name="cpf", nullable = false, updatable = false, insertable = false)
	private User buyer;  //USUARIO QUE ESTÁ VENDENDO (ou o banco num emprestimo)
	public User getBuyer() { return this.buyer; }
	public void setBuyer(User buyer) { this.buyer = buyer; }
	
		public Transaction() {}
	
}
