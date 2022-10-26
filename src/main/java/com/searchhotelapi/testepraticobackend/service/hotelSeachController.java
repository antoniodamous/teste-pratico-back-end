package com.searchhotelapi.testepraticobackend.service;

import com.searchhotelapi.testepraticobackend.TestePraticoBackEndApplication;
import com.searchhotelapi.testepraticobackend.entities.Hotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class hotelSeachController {
    public static void main(String[] args) {
        SpringApplication.run(TestePraticoBackEndApplication.class, args);
    }

    public List<Hotel> getHotel() {
        return null;
    }
}
