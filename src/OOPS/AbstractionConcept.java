package OOPS;


abstract class Animal {
    abstract void walk();
}

class horse extends Animal {
    public void walk() {
        System.out.println("Horse Walks on 4 legs ");
    }
}

class chikhen extends Animal {
    public void walk() {
        System.out.println("Chicken Walk in 2 legs ");
    }
}

public class AbstractionConcept {
    public static void main(String[] args) {

    }
}
