package com.java.dolmayan.JavaStreamsApi.Controller;

import com.java.dolmayan.JavaStreamsApi.dao.CountryDao;
import com.java.dolmayan.JavaStreamsApi.Service.InMemoryWorldDao;

import java.util.Comparator;

public class CityController {

    /**
     * Q.1) Find the most populated city of each continent
     */
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    public static void main(String[] args) {

        //List<Movie> movies=

        /*
        countryDao.findAllCountries()
                .stream()
                .sorted(Comparator.().reverseOrder())
                .forEach(System.out::println);

        */


    }

}
