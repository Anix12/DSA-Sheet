package OOPS;

interface Species {
    void walk();
}

interface herbivours {

}

class Horse implements Species, herbivours {
    public void walk() {
        System.out.println("They Walks on 4 legs");
    }
}

//static keyword
class student {
    static String name;
}

public class InterfaceConcpt {
    public static void main(String[] args) {
        student.name = "MVP";
    }

}
