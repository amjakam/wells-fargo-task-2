package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    private String securityName;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    private LocalDate securityPurchaseDate;
    private Double securityPurchasePrice;
    private Integer securityQuantity;

    protected Security() {}

    public Security(Portfolio portfolio, String securityName, Category category, LocalDate securityPurchaseDate, Double securityPurchasePrice, Integer securityQuantity) {
        this.portfolio = portfolio;
        this.securityName = securityName;
        this.category = category;
        this.securityPurchaseDate = securityPurchaseDate;
        this.securityPurchasePrice = securityPurchasePrice;
        this.securityQuantity = securityQuantity;
    }

    @Override
    public String toString() {
        return String.format(
                "Security[id=%d, portfolio='%s', securityName='%s', category='%s', securityPurchaseDate='%s', securityPurchasePrice=%.2f, securityQuantity=%d]",
                (Object) securityId, portfolio, securityName, category, securityPurchaseDate, securityPurchasePrice, securityQuantity);
    }

    // Getters and Setters

    public Long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getSecurityName() {
        return securityName;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getSecurityPurchaseDate() {
        return securityPurchaseDate;
    }

    public Double getSecurityPurchasePrice() {
        return securityPurchasePrice;
    }

    public Integer getSecurityQuantity() {
        return securityQuantity;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setSecurityPurchaseDate(LocalDate securityPurchaseDate) {
        this.securityPurchaseDate = securityPurchaseDate;
    }

    public void setSecurityPurchasePrice(Double securityPurchasePrice) {
        this.securityPurchasePrice = securityPurchasePrice;
    }

    public void setSecurityQuantity(Integer securityQuantity) {
        this.securityQuantity = securityQuantity;
    }
}
