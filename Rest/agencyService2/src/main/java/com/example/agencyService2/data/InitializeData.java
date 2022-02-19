package com.example.agencyService2.data;


import com.example.agencyService2.model.Agency;
import com.example.agencyService2.model.Hotel;
import com.example.agencyService2.repositories.AgencyRepository;
import com.example.agencyService2.repositories.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitializeData {
    private final Logger logger = LoggerFactory.getLogger(InitializeData.class);
    //Agencies
    private final Agency agency2 = new Agency(7L,"agency2");
    //Hotels
    private final Hotel hotelAcapulco = new Hotel(1L,"Acapulco",2,"Montpellier","http://localhost:8080/acapulco",
            "agency2", 7L);
    private final Hotel hotelIbis = new Hotel(2L,"ibis",2,"Paris","http://localhost:8081/ibis",
            "agency2", 7L);

    @Bean
    public CommandLineRunner initDatabaseAcapulco(HotelRepository hotelRepository,
                                                  AgencyRepository agencyRepository) {
        return args -> {
            logger.info("Preloading database with " + agencyRepository.save(agency2));

            logger.info("Preloading database with " + hotelRepository.save(hotelAcapulco));
            logger.info("Preloading database with " + hotelRepository.save(hotelIbis));

        };
    }

}
