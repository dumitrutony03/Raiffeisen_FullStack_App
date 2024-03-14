package com.financial_platform.financial_platform.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Investors") // Oferă un nume tabelului; opțional dacă sunteți mulțumit cu numele implicit
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "investoId")
    private Long id;
    @Column(name = "investorName")
    private String name;
    @Column(name = "investorEmail")
    private String email;
    @Column(name = "investorPassword")
    private String password;

    public Investor(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getteri și Setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metodele toString(), equals(), și hashCode() pot fi de asemenea suprascrise după necesitate
}
