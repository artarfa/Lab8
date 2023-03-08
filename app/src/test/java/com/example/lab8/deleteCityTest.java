package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class deleteCityTest {

    private ArrayList<City> cityList = new ArrayList<>();
    @Test
    public void deleteCityTest() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(0, cityList.size());

    }

}
