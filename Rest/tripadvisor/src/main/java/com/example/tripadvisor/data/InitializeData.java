package com.example.tripadvisor.data;

import com.example.tripadvisor.model.Agency;
import com.example.tripadvisor.repositories.AgencyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitializeData {
    private final Logger logger = LoggerFactory.getLogger(InitializeData.class);
    //Agencies
    private final Agency agency1 = new Agency(6L,"agency1","http://localhost:8082/agency1");
    private final Agency agency2 = new Agency(7L,"agency2","http://localhost:8083/agency2");

    @Bean
    public CommandLineRunner initDatabaseAcapulco(AgencyRepository agencyRepository) {
        return args -> {
            logger.info("Preloading database with " + agencyRepository.save(agency1));
            logger.info("Preloading database with " + agencyRepository.save(agency2));

        };
    }
}
