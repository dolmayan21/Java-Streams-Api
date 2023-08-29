package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

import java.awt.dnd.DragGestureEvent;
import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {

        Optional<Student> studendtOptionalFindAny = findAnyStudent();
        if(studendtOptionalFindAny.isPresent()){
            System.out.println("Found the student : "+ studendtOptionalFindAny.get());
        }else{
            System.out.println("There's no student");
        }
        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if(studentOptionalFindFirst.isPresent()){
            System.out.println("Found the student : "+ studentOptionalFindFirst.get());
        }else{
            System.out.println("There's no student");
        }

    }
}
