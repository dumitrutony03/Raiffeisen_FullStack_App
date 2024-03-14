package com.financial_platform.financial_platform.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Obiectul de transfer de date (DTO) pentru anunțuri.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvestorDto {
    private Long id;
    private String name;
    private String email;
    private String password;
}

