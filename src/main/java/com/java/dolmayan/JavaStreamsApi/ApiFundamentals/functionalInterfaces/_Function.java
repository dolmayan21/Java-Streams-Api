package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.functionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.Service.InMemoryWorldDao;
import com.java.dolmayan.JavaStreamsApi.dao.CountryDao;
import com.java.dolmayan.JavaStreamsApi.domain.Country;

import java.util.List;
import java.util.function.Function;

public class _Function {

    /**
     * map
     */
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    public static void main(String[] args) {

        List<Integer> numList = List.of(1,3,5,2,13,21,56,43);

        List<Country> countries = countryDao.findAllCountries();

        /*
        numList
             .stream()
             .map(incrementByOneFunction)
             .forEach(System.out::println);
        */

        countries.stream().forEach(System.out::println);



    }
    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    static  Function<Integer, Integer> squareFunction = x -> x * x;


}
