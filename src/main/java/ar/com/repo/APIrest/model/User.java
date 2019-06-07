  package ar.com.repo.APIrest.model;

  import com.fasterxml.jackson.annotation.JsonProperty;
  import net.minidev.json.annotate.JsonIgnore;
  import org.springframework.lang.NonNull;


  import javax.persistence.*;
  import javax.validation.constraints.NotEmpty;
  import javax.validation.constraints.NotNull;
  import java.util.List;

  @Entity
  @Table(name="Users")
  public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @JsonProperty("loans")
    @OneToMany(mappedBy="user" )
    private List<Loan> loanList;

    @NotNull(message = "User_mail no puede quedar con estado null")
    @NotEmpty(message = "User_mail no puede quedar vacio")
    @JsonProperty("user_email")
    private String email;

    @NotNull(message = "User_firstName no puede quedar con estado null")
    @NotEmpty(message = "User_firsttName no puede quedar vacio")
    @JsonProperty("user_firstName")
    private String userFirstName;

    @NotNull(message = "User_lastName no puede quedar con estado null")
    @NotEmpty(message = "User_lastName no puede quedar vacio")
    @JsonProperty("user_lastName")
    private String userLastName;

    public List<Loan> getLoanList() {
      return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
      this.loanList = loanList;
    }
    public void addLoan(Loan f) {
      loanList.add(f);
    }

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {

      this.id = id;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {

      this.email = email;
    }

    public String getUserFirstName() {
      return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
      this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
      return userLastName;
    }

    public void setUserLastName(String userLastName) {
      this.userLastName = userLastName;
    }


  }