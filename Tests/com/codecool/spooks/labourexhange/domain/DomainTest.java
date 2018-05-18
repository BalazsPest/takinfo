package com.codecool.spooks.labourexhange.domain;


import com.codecool.spooks.labourexhange.model.users.City;
import com.codecool.spooks.labourexhange.service.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DomainTest {

    private CityService mockCityService = Mockito.mock(CityService.class);
    private AdvertisementService advServiceTest = new AdvertisementService();
    private UserService usrServiceTest = new UserService();
    private FieldService fieldService = new FieldService();
    private LanguageService languageService = new LanguageService();
    private EntityManagerFactory emfTest; // = Persistence.createEntityManagerFactory("LabourExchangeTest");
    private EntityManager emTest; //= emfTest.createEntityManager();
    private City miskolc = new City("Miskolc");
    private City budapest = new City("Budapest");
    private List<City> cities = new ArrayList<>();
    private Domain domainTest = new Domain(advServiceTest, usrServiceTest, fieldService, mockCityService, languageService);


    @Test
    void getCitiesTest() {
        Mockito.when(mockCityService.getCities(emTest)).thenReturn(cities);
        assertEquals(cities, domainTest.getCities());
    }
}