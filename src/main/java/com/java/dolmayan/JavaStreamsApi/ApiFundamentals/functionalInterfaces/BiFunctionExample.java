package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.functionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    /**
     * map
     */

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentsPredicate) ->
    {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student ->{
            if(studentsPredicate.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeMap;
    });
    public static void main(String[] args) {

        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateExample2.p2));

    }

}
