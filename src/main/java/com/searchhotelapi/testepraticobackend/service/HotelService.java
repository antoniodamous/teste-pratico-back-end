package com.searchhotelapi.testepraticobackend.service;

import com.searchhotelapi.testepraticobackend.entities.Address;
import com.searchhotelapi.testepraticobackend.entities.Hotel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class HotelService {

	@Value("${url.info tera}")
	String url;
	String uri = "/api/v1//avail/hotel?destination={destination}&start={start}&end={end}&occupancy={occupancy}";

	public Address search(String address) {
		String fullUrl = url + address;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(fullUrl, Address.class);
	}

	private hotelSeachController hotelSearchController;

	public List<Hotel> getHotels(Integer destination, String name, String end, String occupancy) {
		return hotelSearchController.getHotel();
	}
}