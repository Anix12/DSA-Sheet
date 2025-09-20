package JavaBasics;
//its Known Method Overloading and also compile Time Polymorphism
class Student {
    String name;
    int age;

    void printInfo(String name) {
        System.out.println(name);
    }

    void prinInfo(int age) {
        System.out.println(age);
    }

    void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

}

public class OOPS { //polymorphism
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aniket";
        s1.age = 20;
        s1.printInfo(s1.name, s1.age);
    }
}
