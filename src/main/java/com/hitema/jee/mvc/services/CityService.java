package com.hitema.jee.mvc.services;

import com.hitema.jee.mvc.entities.City;

import java.util.List;

public interface CityService {
    List<City> readAll();
    City getDetails(long id);
    City update(City city, long id);
}
