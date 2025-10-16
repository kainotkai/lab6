package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.addCity(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City ("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList citylist = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        citylist.addCity(city);
        assertThrows(IllegalArgumentException.class, () -> {
            citylist.addCity(city);
        });
    }

    @Test
    void testGetCities() {
        CityList citylist = mockCityList();
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(0)));

        City city = new City("Charlottetown", "Prince Edward Island");
        citylist.addCity(city);

        assertEquals(0, city.compareTo(citylist.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(1)));
    }

    @Test
    void testHasCity() {
        CityList citylist = mockCityList();
        assertEquals(0, citylist.hasCity(mockCity()));

        citylist.addCity(new City("Calgary","Alberta"));
        assertThrows(RuntimeException.class, () -> {
            citylist.hasCity(new City("123", "456"));
        });
    }
}

