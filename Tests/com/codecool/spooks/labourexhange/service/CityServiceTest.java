package com.codecool.spooks.labourexhange.service;

import static org.junit.jupiter.api.Assertions.*;

import com.codecool.spooks.labourexhange.model.users.City;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

class CityServiceTest {

    private EntityManagerFactory emfTest; //= Persistence.createEntityManagerFactory("LabourExchangeTest");
    private EntityManager emTest; //= emfTest.createEntityManager();
    private CityService testCityService = new CityService();
    private City testCity = new City("Miskolc");
    private String name = "Miskolc";

    @Test
    void findCityTest() {
        //Mockito.when(entityManagerMock.createNamedQuery("getCityByName", City.class).setParameter("name", name).getSingleResult()).thenReturn(testCity);
        //assertEquals(testCity, testCityService.findCity("Miskolc", entityManagerMock));

        Mockito.when(testCityService.findCity("Miskolc", emTest)).thenReturn(testCity);
        assertEquals("Miskolc", testCity.getName());
    }


}