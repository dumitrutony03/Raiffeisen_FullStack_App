package com.financial_platform.financial_platform.Repository;

import com.financial_platform.financial_platform.Model.Startup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartupRepository extends JpaRepository<Startup, Long> {

}
