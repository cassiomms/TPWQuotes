package tpwquotes.model;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="tTransaction")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="transtype", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("transaction")
public class Transaction implements Serializable
{
  private Long id;
  private Date date;
  private User seller;  //USUARIO QUE ESTÁ VENDENDO (ou o banco num emprestimo)
  private User buyer;  //USUARIO QUE ESTÁ COMPRANDO (ou o usuario num emprestimo)

  public Transaction() {}

  @Id
  @SequenceGenerator(name="seq_tid", sequenceName="seq_tid")
  @GeneratedValue(strategy=GenerationType.AUTO, generator="seq_tid")
  public Long getId() { return id; }
  public void setId(Long id) { this.id=id; }

  @Column(nullable=false)
  @Temporal(TemporalType.TIMESTAMP)
  public Date getDate() { return this.date; }
  public void setDate(Date date) { this.date=date; }

  @ManyToOne
  @JoinColumn(nullable=false, updatable=false, insertable=false)
  public User getSeller() { return this.seller; }
  public void setSeller(User seller) { this.seller=seller; }

  @ManyToOne
  @JoinColumn(nullable=false, updatable=false, insertable=false)
  public User getBuyer() { return this.buyer; }
  public void setBuyer(User buyer) { this.buyer=buyer; }
}
