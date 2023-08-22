package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.methodReferences;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * forEach
     */

    static Consumer<Student> c1 = p -> System.out.println(p);

    /**
     * ClasssName::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    static Consumer<Student> cx = System.out::println;
    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);

        StudentDataBase.getAllStudents().forEach(c2);

    }
}
