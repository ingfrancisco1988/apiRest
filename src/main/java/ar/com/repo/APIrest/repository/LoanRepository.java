package ar.com.repo.APIrest.repository;

import ar.com.repo.APIrest.model.UserLoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<UserLoan, Long > {

}
