package ar.com.repo.APIrest.repository;


import ar.com.repo.APIrest.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long > {

}
