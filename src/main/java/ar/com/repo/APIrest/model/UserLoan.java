package ar.com.repo.APIrest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table(name = "Loans")
public class UserLoan {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLoan;

    @JsonProperty("total")
    private int total;

    @JsonProperty("user_id")
    private long userId;


    public void setId(long id) {
        this.idLoan = id;
    }

    public long getId() {
        return idLoan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public long getUser() {
        return userId;
    }

    public void setUser(long userId) {
        this.userId = userId;
    }
}
