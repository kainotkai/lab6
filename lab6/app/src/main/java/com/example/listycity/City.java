package com.example.listycity;

import java.util.Objects;

/**
 * This class keeps track of a city
 */
public class City implements Comparable{

    private String city;
    private String province;

    /**
     *
     * @param city
     *      Stores the city as a String
     * @param province
     *      Stores the province as a String
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * get the City instance's name
     * @return City instance's name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Get this City instance's province
     * @return Get this City instance's province
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * This function compares two cities by getName()
     * @param o the object to be compared.
     * @return compareTo getCityName()
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * This says whether two city objects are equal. They are equal when hashcodes are the same
     * @param o
     *      Object to compare to, must be a City type
     * @return
     *      whether hashcode of o is equal to this.city's hashcode
     */
    @Override
    public boolean equals(Object o) {
        City c = (City) o;
        return c.hashCode() == this.hashCode();
    }

    /**
     *  Hashcode is calculated with Objects.hash(this.city, this.province)
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.city,this.province);
    }
}
