package ar.com.repo.APIrest.DTO;



import ar.com.repo.APIrest.model.Loan;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.minidev.json.annotate.JsonIgnore;


import java.io.Serializable;
import java.util.List;


public class DtoUser implements Serializable {
  private int id;
  private String user_email;
  private String userFirstName;
  private String userLastName;
  private List<Loan> loans;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUser_email() {
    return user_email;
  }

  public void setUser_email(String user_email) {
    this.user_email = user_email;
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

  public List<Loan> getUserLoans() {
    return loans;
  }
  @JsonIgnore
  public void setUserLoans(List userLoans) {
    this.loans = userLoans;
  }
}



