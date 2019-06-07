package ar.com.repo.APIrest.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "loan")
public class Loan {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idLoan", unique = true, nullable = false)
  private Integer idLoan;


  //@NotEmpty(message = "total no puede quedar con estado null")
  @NotNull(message = "total no puede quedar vacio")
  @JsonProperty("total")
  private int total;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id")
  @JsonIgnore
  private User user;


  public void setId(Integer id) {
    this.idLoan = id;
  }

  public Integer getId() {
    return idLoan;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }


  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }

}
