package com.financial_platform.financial_platform.Repository;

import com.financial_platform.financial_platform.Model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long> {
    /*
    The use of Optional here is a good practice to handle
    the possibility that no investor might be found with the provided credentials.
     */
    Optional<Investor> findByEmailAndPassword(String email, String password);

}
