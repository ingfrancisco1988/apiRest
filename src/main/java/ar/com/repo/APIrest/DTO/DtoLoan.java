package ar.com.repo.APIrest.DTO;

import java.io.Serializable;

public class DtoLoan implements Serializable {
  private int idLoan;
  private int total;
  private Integer userId;



  public int getId() {
    return idLoan;
  }

  public void setId(int id) {
    this.idLoan = id;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


}
