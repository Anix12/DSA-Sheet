package OOPS;

class ABC {
    int x = 10;
}

public class ShallowCopy {
    public static void main(String[] args) {
        ABC obj1 = new ABC();
        //shallow Copy - Copying the reference not the value
        ABC obj2 = obj1;
        obj2.x = 15;
        System.out.println(obj1.x);
        //-----------------------------------------------------------------
        //Deep Copy
        ABC a = new ABC();
        ABC b = new ABC();
        System.out.println(b.x);
    }
}
