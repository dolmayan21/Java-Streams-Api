package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.FunctionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * forEach
     */
    static Consumer<Student> c2 = (s) -> System.out.println(s);
    static Consumer<Student> c3 = (s) -> System.out.println(s.getName());
    static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        //c1.accept("java8");

        //printName();

        printNameAndActivitiesUsingCondition();


    }

    public static void printName(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition : \n");
        List<Student> personList = StudentDataBase.getAllStudents();
        personList.forEach((s) -> {
            if( s.getGradeLevel()>=3 && s.getGpa()>3.9){
                c2.andThen(c4).andThen(c2).accept(s);
                System.out.println("***");
            }
        });
    }


}
