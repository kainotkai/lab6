package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class keeps track of City objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     *
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void addCity(City city) {
        if(cities.contains(city)) throw new IllegalArgumentException();
        cities.add(city);
    }


    /**
     * This returns a list of sorted cities
     * @return
     *      a sorted list of cities that the CityList instance has
     */
    public List<City> getCities() {
       List<City> list = cities;
       Collections.sort(list);
       return list;
    }

    /**
     * This function finds and removes a city if it is in the city list
     * @param city
     *      this is the candidate city to remove
     * @return
     *      This reutrns the size of the list if that city if found.
     *      If not found, throw RuntimeError
     *
     */
    public int hasCity(City city) {
        for(City c : this.cities) {
            if(c.equals(city)) {
                cities.remove(city);
                return cities.size();
            }
        }
        throw new RuntimeException();
    }

}
