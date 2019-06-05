package ar.com.repo.APIrest.DTOUser;

import java.io.Serializable;

public class DtoUser implements Serializable {
    private Long id;
    private String user_email;
    private String userFirstName;
    private String userLastName;
    private String userLoans;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getUserLoans() {
        return userLoans;
    }

    public void setUserLoans(String userLoans) {
        this.userLoans = userLoans;
    }
}
