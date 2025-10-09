package OOPS;

class Student {
    String name;
    int roll_no;

    String get_Name(String name) {
        return this.name = name;
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aniket";
        System.out.println(s1.get_Name(s1.name));
    }

}
