package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.functionalInterfaces;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    /**
     * filter
     *
     */

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    static Predicate<Student> p3 = (s) -> s.getGradeLevel()>=4;
    public static void filterStudentsByGradeLevel( ) {
        System.out.println("*** filterStudentsByGradeLevel");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student ->{
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentsByGpa( ) {
        System.out.println("*** filterStudentsByGpa");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student ->{
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents(){
        System.out.println("*** filterStudents");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student ->{
            if(p2.and(p3).negate().test(student)){
                System.out.println(student);
            }else{
                System.out.println(student);
            }
        });


    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();

        filterStudentsByGpa();
        filterStudents();
    }



}
