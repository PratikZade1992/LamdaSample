package com.pz.lamda;

import com.pz.data.Student;

import java.util.function.Consumer;

public class LamdaLocalVariableExample {

  static Integer v=6;


  public static void main(String[] args) {
    Integer i=2;
    Student student=new Student("him");

    //  Consumer<Integer> consumer=(i)->{ we cant used same variable name as of local variable
    Consumer<Integer> consumer =
        (v) -> { // But we can used same variable as class name
      // i=2; we also can't perform assignment for in function
          System.out.println("test : "+v*2);
        };
    consumer.accept(2);

    Consumer<Student> consumer1=(student1)->{// same we can say for object variable

    };

  }
}
