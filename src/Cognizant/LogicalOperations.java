package Cognizant;

public class LogicalOperations {

    public static int LogicalOr(int a, int b){
     return a|b;
    }
    public static void main(String[] args) {
        int a=0; int b=9;
        System.out.println(LogicalOr(a,b));
    }
}
