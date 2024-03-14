package com.financial_platform.financial_platform.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Startups") // Oferă un nume tabelului; opțional dacă sunteți mulțumit cu numele implicit
public class Startup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "startupId")
    private Long id;
    @Column(name = "startupName")
    private String name;
    @Column(name = "startupEmail")
    private String email;
    @Column(name = "startupPassword")
    private String password;

    @Column(name = "startupDescription")
    private String description;


    // Constructori
    public Startup(String name, String email, String password) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Metodele toString(), equals(), și hashCode() pot fi de asemenea suprascrise după necesitate
}
