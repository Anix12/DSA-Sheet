package OOPS;

class Car {
    String type;
    int legs;

    void CarInfo() {
        System.out.println("Car is Running ");
    }
}

class Maruti extends Car {

    String printType(String type) {
        return this.type = type;
    }

    void printLegs() {
        System.out.println("2 legs is their");
    }
}

public class InheritanceConcept {

    public static void main(String[] args) {
        Maruti b = new Maruti();
        b.type = "hybrid";
        System.out.println(b.printType(b.type));
    }

}
