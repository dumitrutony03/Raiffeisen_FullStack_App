package com.financial_platform.financial_platform.Controller;


import com.financial_platform.financial_platform.Model.Dto.InvestorLoginDto;
import com.financial_platform.financial_platform.Model.Investor;
import com.financial_platform.financial_platform.Service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<?> registerInvestor(@RequestBody Investor investor) {
        Optional<Investor> registeredInvestor = investorService.addInvestor(investor);
        if (!registeredInvestor.isPresent()) {
            return ResponseEntity.badRequest().body("Investor with the given email already exists or invalid data.");
        }
        return ResponseEntity.ok(registeredInvestor.get());
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginInvestor(@RequestBody InvestorLoginDto investorLoginDto) {
        Optional<Investor> investor = investorService.findInvestorByEmailAndPassword(investorLoginDto.getEmail(), investorLoginDto.getPassword());
        if (investor.isPresent()) {
            return ResponseEntity.ok().body("Login successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }


}