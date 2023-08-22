package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.functionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample2 {

    /**
     * map
     */
    static Function<List<Student>, Map<String, Double>> studentFuncion = ( students ->{
        Map<String, Double> studentGrademap = new HashMap<>();
        students.forEach(student ->{
            if(PredicateExample2.p1.test(student)) {
                studentGrademap.put(student.getName(), student.getGpa());
            }
        });
        return studentGrademap;

    });
    public static void main(String[] args) {

        System.out.println(studentFuncion.apply(StudentDataBase.getAllStudents()));

    }
}
