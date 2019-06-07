package ar.com.repo.APIrest.controllers;

import ar.com.repo.APIrest.DTO.DtoLoan;
import ar.com.repo.APIrest.model.Loan;
import ar.com.repo.APIrest.model.User;
import ar.com.repo.APIrest.service.LoanService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/loan")
@Api(value="LoanControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoanController {

  @Autowired
  LoanService loanService;

  @RequestMapping(value = "/", method = RequestMethod.POST)
  private Loan create(@RequestBody DtoLoan dtoLoan) {
    Loan userLoan = new Loan();
    User user = new User();
    userLoan.setTotal(dtoLoan.getTotal());
    //asigno el valor de la id con una instancia de user
    user.setId(dtoLoan.getUserId());

    userLoan.setUser(user);
    return loanService.create(userLoan);
  }

}
