package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.FunctionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {


    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () ->{
            return new Student("Sophia",4,3.5,"female",10, Arrays.asList("swimming", "dancing","football"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is : " + studentSupplier.get());

        System.out.println("Students are : " + listSupplier.get());
    }
}
