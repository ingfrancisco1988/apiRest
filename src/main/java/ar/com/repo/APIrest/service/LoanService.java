  package ar.com.repo.APIrest.service;


  import ar.com.repo.APIrest.model.Loan;
  import ar.com.repo.APIrest.repository.LoanRepository;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;

  @Service
  public class LoanService {
    /*Servicios para loans*/
    @Autowired
    private LoanRepository loanRepository;

    public Loan create(Loan userLoan) {
      return loanRepository.save(userLoan);
    }
  }
