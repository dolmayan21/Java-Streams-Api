package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams_terminal;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    public static void groupStudentsByGender(){

        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizedGroupingBy(){

            Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream() // Stream<Students>
                .collect(groupingBy(student -> student.getGpa()>= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1(){

    Map<Integer, Map<String, List<Student>>> studentMap =  StudentDataBase.getAllStudents()
            .stream()
            .collect(groupingBy(Student::getGradeLevel,
                    groupingBy(student -> student.getGpa()>= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMap);

    }

    public static void twoLevelGrouping_2(){

        Map<String, Integer> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);

    }

    public static void threeArgumentGroupBy(){

       LinkedHashMap<String, Set<Student>> studentLinkedHashMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));

        System.out.println(studentLinkedHashMap);
    }

    public static void main(String[] args) {

        groupStudentsByGender();
        System.out.println();
        //customizedGroupingBy();
        System.out.println();
       //twoLevelGrouping_1();
        System.out.println();
        //twoLevelGrouping_2();
        System.out.println();
        //threeArgumentGroupBy();

    }
}
