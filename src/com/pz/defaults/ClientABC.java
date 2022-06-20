package com.pz.defaults;

public class ClientABC implements Interface1,Interface2,Interface3{
  public void methodeA(){
    System.out.println("inside interface 1 :"+ClientABC.class);
  }

  //in case of multiple inheritance first priority is given to local class methode
  //If the it is not available in local the priority goes to extended interface methode

  public static void main(String[] args) {
  ClientABC clientABC=new ClientABC();
  clientABC.methodeA();
  clientABC.methodeB();
  clientABC.methodeC();
  }
}
