package com.example.hotelServiceIbis.dataAcapulco;


import com.example.hotelServiceIbis.model.Agency;
import com.example.hotelServiceIbis.model.Hotel;
import com.example.hotelServiceIbis.model.Room;
import com.example.hotelServiceIbis.repositories.AgencyRepository;
import com.example.hotelServiceIbis.repositories.HotelRepository;
import com.example.hotelServiceIbis.repositories.RoomRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitializeDataAcapulco {
    private Logger logger = LoggerFactory.getLogger(InitializeDataAcapulco.class);
    //Hotels
    private Hotel hotelAcapulco = new Hotel(2L,"ibis",2,"Paris");
    //Rooms
    private final Room room1 = new Room(1, 2, 2, 50, 2L, "chambre.jpeg");
    private final Room room2 = new Room(2, 3, 3, 55, 2L, "chambre.jpeg");
    private final Room room3 = new Room(3, 1, 2, 45, 2L, "chambre.jpeg");
    private final Room room4 = new Room(4, 1, 2, 40, 2L, "chambre.jpeg");
    //Agencies
    private final Agency agency1 = new Agency(6L,"agency1",10,2L);
    private final Agency agency2 = new Agency(7L,"agency2",20,2L);


    @Bean
    public CommandLineRunner initDatabaseIbis(RoomRepository roomRepository, HotelRepository hotelRepository,
                                                  AgencyRepository agencyRepository) {
        return args -> {
            logger.info("Preloading database with " + hotelRepository.save(hotelAcapulco));

            logger.info("Preloading database with " + roomRepository.save(room1));
            logger.info("Preloading database with " + roomRepository.save(room2));
            logger.info("Preloading database with " + roomRepository.save(room3));
            logger.info("Preloading database with " + roomRepository.save(room4));

            logger.info("Preloading database with " + agencyRepository.save(agency1));
            logger.info("Preloading database with " + agencyRepository.save(agency2));
        };
    }
}
