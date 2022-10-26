package com.searchhotelapi.testepraticobackend.entities;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	@JsonProperty("hotel")
	public com.searchhotelapi.testepraticobackend.entities.Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(com.searchhotelapi.testepraticobackend.entities.Hotel hotel) {
		this.hotel = hotel;
	}

	com.searchhotelapi.testepraticobackend.entities.Hotel hotel;

	@JsonProperty("hotels")
	public ArrayList<com.searchhotelapi.testepraticobackend.entities.Hotel> getHotels() {
		return this.hotels;
	}

	public void setHotels(ArrayList<com.searchhotelapi.testepraticobackend.entities.Hotel> hotels) {
		this.hotels = hotels;
	}

	ArrayList<com.searchhotelapi.testepraticobackend.entities.Hotel> hotels;

}
