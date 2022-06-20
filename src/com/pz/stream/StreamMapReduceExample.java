package com.pz.stream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Optional;

// to get the total no of notebook student have
public class StreamMapReduceExample {

  static Optional<Integer> getTotalNoOfNoteBook() {
    return StudentDatabase.getStudentList().stream() // Stream<Student>
            .filter(student -> student.getGrade()>3)
        .map(Student::getNoteBook) // Stream<int>
        // .reduce((a,b)->a+b);// int perform operation for addition
        .reduce(Integer::sum);// same as above
  }

  public static void main(String[] args) {
    Optional<Integer> totalNoOfNoteBook = getTotalNoOfNoteBook();
    if (totalNoOfNoteBook.isPresent()) {
      System.out.println("Total no of notebook student has : " + totalNoOfNoteBook.get());
    }
  }
}
