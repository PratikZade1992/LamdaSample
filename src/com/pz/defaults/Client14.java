package com.pz.defaults;

public class Client14 implements Interface1,Interface4 {
    //in case of multiple inheritance if both interface have same methode then
    //class give compilation error so in that case we need to override the methode
    public void methodeA(){
        System.out.println("inside interface 1"+Client14.class);
    }

  public static void main(String[] args) {
    Client14 client14=new Client14();
    client14.methodeA();
  }
}
