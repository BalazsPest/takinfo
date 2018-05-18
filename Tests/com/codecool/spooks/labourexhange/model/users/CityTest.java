package com.codecool.spooks.labourexhange.model.users;

import com.codecool.spooks.labourexhange.service.CityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {


        private City testCity = new City("Miskolc");
        private String name = "Miskolc";
        private Student student = new Student("someone", "asdf", "asdfa");
        private List<Student> students = new ArrayList<>();




       @BeforeEach
       void testSetUp(){
           this.students.add(student);
       }

        @Test
        void getNameTest() {
            assertEquals("Miskolc", testCity.getName());
        }

        @Test
        void getIdTest(){
            assertEquals(0, testCity.getId());
        }

        @Test
        void addStudentTest() {
            testCity.addStudents(student);
            assertEquals(students, testCity.getStudents());
        }
    }