package com.pz.functionalinterface;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Supplier take no input and return one output
// it has getMethode
public class SupplierExample {

  public static void main(String[] args) {

      Supplier<Student> studentSupplier=()->{
        return new Student("xyz",5,5,"male", 10, Arrays.asList("a","b","c")) ;
      };

    System.out.println("Student from supplier is  : "+studentSupplier.get() );

      Supplier<List<Student>> listSupplier=()-> StudentDatabase.getStudentList();
    System.out.println("Student list from  supplier list   : "+listSupplier.get());



  }
}
