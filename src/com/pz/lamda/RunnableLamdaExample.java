package com.pz.lamda;

public class RunnableLamdaExample {
  public static void main(String[] args) {
    // old way
    Runnable runnable =
        new Runnable() {
          @Override
          public void run() {
            System.out.println(" Start the thread");
          }
        };
    Thread thread = new Thread(runnable);
    thread.start();

    // with Lamda
    // 1
    Runnable runnable1Lamda =
        () -> {
          System.out.println(" Start the thread using lamda");
        };
    new Thread(runnable1Lamda).start();
    // 2
    Runnable runnable1Lamda1 = () -> System.out.println(" Start the thread using lamda 2");
    new Thread(runnable1Lamda1).start();
    // 3
    new Thread(() -> System.out.println(" Start the thread using lamda 3")).start();
    // 4 in case of multiple statement
      new Thread(()->{
          System.out.println(" Start the thread using lamda 4");
          System.out.println(" Start the thread using lamda 5");



      }).start();
  }
}
