// Implementing the steps from Accessing Data with JPA  https://spring.io/guides/gs/accessing-data-jpa
package com.wellsfargo.counselor.entity;

import com.wellsfargo.counselor.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ClientRepository clientRepository, AdvisorRepository advisorRepository, PortfolioRepository portfolioRepository, SecurityRepository securityRepository, CategoryRepository categoryRepository) {
        return (args) -> {
            // Save a few advisors
            Advisor advisor1 = advisorRepository.save(new Advisor("Amjad", "Kamara", "21 maxwell Street", "232-075-2390", "amjad@testing.com"));
            Advisor advisor2 = advisorRepository.save(new Advisor("Mark", "Mohamed", "11 Kissy Road", "232-118-3671", "mark.kamara@amjadkamara.com"));

            // Save a few clients
            Client client1 = clientRepository.save(new Client(advisor1, "Michael", "James", "james@007.com", "007-007-0707", "12 Mission Street", "Freetown", "Western Area", "Sierra Leone", "Active"));
            Client client2 = clientRepository.save(new Client(advisor2, "Janet", "Stadium", "j.stadium@example.com", "223-5679-2211", "101, Regent Road", "Accra", "Adenta", "Ghana", "Inactive"));

            // Save a few portfolios
            Portfolio portfolio1 = portfolioRepository.save(new Portfolio(client1, "Growth Fund Portfolio", "Aggressive Growth", LocalDate.now(), LocalDate.now(), "Active", "USD"));
            Portfolio portfolio2 = portfolioRepository.save(new Portfolio(client2, "Balanced Investment Portfolio", "Conservative Income", LocalDate.now(), LocalDate.now(), "Inactive", "EUR"));

            // Save a few categories
            Category category1 = categoryRepository.save(new Category("Equities"));
            Category category2 = categoryRepository.save(new Category("Bonds"));

            // Save a few securities
            securityRepository.save(new Security(portfolio1, "Equity Shares", category1, LocalDate.now(), 100.0, 10));
            securityRepository.save(new Security(portfolio2, "Corporate Bonds", category2, LocalDate.now(), 200.0, 20));

            // Fetch all advisors
            log.info("Advisors found with findAll():");
            log.info("-------------------------------");
            advisorRepository.findAll().forEach(advisor -> {
                log.info(advisor.toString());
            });
            log.info("");

            // Fetch all clients
            log.info("Clients found with findAll():");
            log.info("-------------------------------");
            clientRepository.findAll().forEach(client -> {
                log.info(client.toString());
            });
            log.info("");

            // Fetch all portfolios
            log.info("Portfolios found with findAll():");
            log.info("-------------------------------");
            portfolioRepository.findAll().forEach(portfolio -> {
                log.info(portfolio.toString());
            });
            log.info("");

            // Fetch all categories
            log.info("Categories found with findAll():");
            log.info("-------------------------------");
            categoryRepository.findAll().forEach(category -> {
                log.info(category.toString());
            });
            log.info("");

            // Fetch all securities
            log.info("Securities found with findAll():");
            log.info("-------------------------------");
            securityRepository.findAll().forEach(security -> {
                log.info(security.toString());
            });
            log.info("");

            // Fetch an individual advisor by ID
            Advisor advisor = advisorRepository.findById(1L).orElse(null);
            if (advisor != null) {
                log.info("Advisor found with findById(1L):");
                log.info("--------------------------------");
                log.info(advisor.toString());
                log.info("");
            }

            // Fetch an individual client by ID
            Client client = clientRepository.findById(1L).orElse(null);
            if (client != null) {
                log.info("Client found with findById(1L):");
                log.info("--------------------------------");
                log.info(client.toString());
                log.info("");
            }

            // Fetch an individual portfolio by ID
            Portfolio portfolio = portfolioRepository.findById(1L).orElse(null);
            if (portfolio != null) {
                log.info("Portfolio found with findById(1L):");
                log.info("--------------------------------");
                log.info(portfolio.toString());
                log.info("");
            }

            // Fetch an individual security by ID
            Security security = securityRepository.findById(1L).orElse(null);
            if (security != null) {
                log.info("Security found with findById(1L):");
                log.info("--------------------------------");
                log.info(security.toString());
                log.info("");
            }

            // Fetch clients by last name
            log.info("Clients found with findByLastName('James'):");
            log.info("--------------------------------------------");
            clientRepository.findByLastName("James").forEach(c -> {
                log.info(c.toString());
            });
            log.info("");

            // Fetch advisors by last name
            log.info("Advisors found with findByLastName('Kamara'):");
            log.info("--------------------------------------------");
            advisorRepository.findByLastName("Kamara").forEach(a -> {
                log.info(a.toString());
            });
            log.info("");
        };
    }
}
