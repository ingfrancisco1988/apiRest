package ar.com.repo.APIrest.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {

  @Id
  @PrimaryKeyJoinColumn
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @JsonProperty("user_mail")
  private String email;

  @JsonProperty("user_firstName")
  private String userFirstName;

  @JsonProperty("user_lastName")
  private String userLastName;

  @JsonProperty("loans")
  private  String loans;

  public long getId() {
    return id;
  }

  public void setId(int id) {
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

  public String getLoans() {
    return loans;
  }

  public void setLoans(String loans) {
    this.loans = loans;
  }
}