package ar.com.repo.APIrest.DTO;




import java.io.Serializable;

public class DtoLoan implements Serializable {
    private long idLoan;
    private int total;
    private long userId;



    public long getId() {
        return idLoan;
    }

    public void setId(long id) {
        this.idLoan = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


}
