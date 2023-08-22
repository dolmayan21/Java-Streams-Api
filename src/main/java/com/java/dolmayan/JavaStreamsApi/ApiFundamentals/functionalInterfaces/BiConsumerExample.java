package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.functionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    /**
     * forEach
     *
     * Consumer Interface will only accept the input
     * and it doesn't return any output out of that
     */

    public static void NameAndActivities(){

        BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name + " : "+ activities);
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(s -> biConsumer.accept(s.getName(), s.getActivities()));
    }
    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a,b) ->{
            System.out.println("a :" + a +", b :"+b );
        };
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer,Integer> multiply = (a,b) ->{
            System.out.println("Multiplication is : " + (a*b));
        };

        BiConsumer<Integer,Integer> division = (a,b) ->{
            System.out.println("Division is : " + (a/b));
        };

        //multiply.andThen(division).accept(10,5);

        NameAndActivities();
    }
}
