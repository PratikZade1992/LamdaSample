package com.pz.methodreference;

import com.pz.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
  static Supplier<Student> studentSupplier=Student::new;

  static Function<String,Student> studentFunction=Student::new;
    public static void main(String[] args) {
    System.out.println(" Student with supplier : "+studentSupplier.get());
    System.out.println("Student with Function : "+studentFunction.apply("Charlie"));
  }
}
