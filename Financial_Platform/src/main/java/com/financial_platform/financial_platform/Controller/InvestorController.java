package com.financial_platform.financial_platform.Controller;


import com.financial_platform.financial_platform.Model.Investor;
import com.financial_platform.financial_platform.Service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // React's default port
@RequestMapping("/api/investor")
public class InvestorController {

    @Autowired
    private InvestorService investorService;

    @GetMapping("")
    public List<Investor> getAllInvestors() {
        return investorService.getAllInvestors();
    }
    @PostMapping("/register")
    public Investor addInvestor(@RequestBody Investor investor) {
        return investorService.addInvestor(investor);
    }

//    @GetMapping("/{id}")
//    public Investor getInvestorById(@PathVariable Long id) {
//        return investorService.getInvestorById(id);
//    }

//    @PutMapping("/{id}")
//    public Investor updateInvestor(@PathVariable Long id, @RequestBody Investor investorDetails) {
//        return investorService.updateInvestor(id, investorDetails);
//    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteInvestor(@PathVariable Long id) {
//        investorService.deleteInvestor(id);
//        return ResponseEntity.ok().build();
//    }
}