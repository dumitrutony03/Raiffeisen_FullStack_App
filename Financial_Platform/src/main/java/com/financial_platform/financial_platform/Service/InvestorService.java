package com.financial_platform.financial_platform.Service;

import com.financial_platform.financial_platform.Model.Investor;
import com.financial_platform.financial_platform.Repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestorService {

    @Autowired
    private InvestorRepository investorRepository;

    public List<Investor> getAllInvestors() {
        return investorRepository.findAll();
    }

    /*
    This saves our Investor into DB
    Involves the REGISTER PAGE /api/investor/register and a POST method after GET
     */
    public Optional<Investor> addInvestor(Investor investor) {
        return Optional.of(investorRepository.save(investor));
    }

    public Optional<Investor> findInvestorByEmailAndPassword(String email, String password) {
        return investorRepository.findByEmailAndPassword(email, password);
    }
    //        public Investor getInvestorById(Long id) {
//        return investorRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));
//    }

//    public Investor updateInvestor(Long id, Investor investorDetails) {
//        Investor investor = investorRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Investor not found with id " + id));
//        investor.setName(investorDetails.getName());
//        investor.setEmail(investorDetails.getEmail());
//        investor.setPassword(investorDetails.getPassword());
//        return investorRepository.save(investor);
//    }

//    public void deleteInvestor(Long id) {
//        investorRepository.deleteById(id);
//    }
}
