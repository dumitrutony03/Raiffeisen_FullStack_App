package com.financial_platform.financial_platform.Repository;

import com.financial_platform.financial_platform.Model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long> {

}
