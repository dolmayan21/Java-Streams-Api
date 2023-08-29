package com.java.dolmayan.JavaStreamsApi.ApiFundamentals.streams;

import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.Student;
import com.java.dolmayan.JavaStreamsApi.ApiFundamentals.model.StudentDataBase;

public class StreamMapReduceExample {

    public static int noOfNoteBooks(){
        int noOfNoteBooks = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)// Stream<Integer>
                //.reduce(0, (a,b)-> a+b);
                .reduce(0, Integer::sum);

        return noOfNoteBooks;
    }
    public static void main(String[] args) {

       System.out.println("\nNo of notebooks : " + noOfNoteBooks()  );

    }
}
