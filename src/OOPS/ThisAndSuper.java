package OOPS;

class Person  {
    void Walk() {
        System.out.println("Person Walking ");
    }
}

class Man extends Person {
    void Walk() {
        super.Walk();
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {
        Man m=new Man();
        m.Walk();
    }
}
