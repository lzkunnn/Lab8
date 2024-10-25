package com.example.lab8;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



//import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList MockCityList() {
        CustomList list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "count should have been zero");
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);

        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "The city count is now 1 after adding one city");

    }

    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City city = new City("Calgary", "AB");

        // Test that the city is not in the list initially
        assertFalse(list.hasCity(city), "City should not be in the list initially");

        // Add the city to the list
        list.addCity(city);

        // Test that the city is now in the list
        assertTrue(list.hasCity(city), "City should be in the list after adding it");
    }



}
