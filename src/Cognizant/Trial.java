package Cognizant;

class Animal{
    String name;
    int age;

    int age(int age){
        return this.age=age;
    }
    void nameAndage(){
        System.out.println(name+" "+ age);
    }
}
public class Trial {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.name="Sharuu";
        a.age=12;
        a.nameAndage();
    }
}
