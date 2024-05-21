package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class   Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    private String portfolioName;
    private String portfolioType;
    private LocalDate creationDate;
    private LocalDate lastUpdated;
    private String status;
    private String currency;

    protected Portfolio() {}

    public Portfolio(Client client, String portfolioName, String portfolioType, LocalDate creationDate, LocalDate lastUpdated, String status, String currency) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.portfolioType = portfolioType;
        this.creationDate = creationDate;
        this.lastUpdated = lastUpdated;
        this.status = status;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return String.format(
                "Portfolio[id=%d, client='%s', portfolioName='%s', portfolioType='%s', creationDate='%s', lastUpdated='%s', status='%s', currency='%s']",
                portfolioId, client, portfolioName, portfolioType, creationDate, lastUpdated, status, currency);
    }

    // Getters and Setters

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
