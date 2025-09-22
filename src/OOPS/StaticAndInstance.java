package OOPS;

class Bike {
    static int age;
    static void walk() {
        System.out.println("Bike is Running ");
         age =42; //only referse the Static Keyword
    }
}

//instance Method is Our Normal Classes Which access both static and normal attribute ! also allow to use this keyword !! they Created
//by the help of objects
//Like Account a=new Account(); a.balance();

public class StaticAndInstance {
    public static void main(String[] args) {
        Bike.walk();
    }
}
