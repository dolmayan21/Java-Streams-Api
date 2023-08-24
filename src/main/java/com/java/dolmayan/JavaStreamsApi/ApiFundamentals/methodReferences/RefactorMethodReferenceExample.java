package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.methodReferences;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    /**
     *  Predicate -> test(),and(), negate(), or(), isEqual()
     *
     * filter
     */

    static Predicate<Student> p1 =RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel() >= 3;
    }



    public static void main(String[] args) {

        System.out.println(StudentDataBase.studentSupplier.get());

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }
}
