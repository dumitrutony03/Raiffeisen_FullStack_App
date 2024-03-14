package com.financial_platform.financial_platform.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddInvestorRequest {
    private String name;
    private String email;
    private String password;
}
