package OOPS;

public class ConstructorChainning {
    //this Called Constructor Chainning
    ConstructorChainning() {
        this("java");
        System.out.println("Default Constructor Called");
    }

    ConstructorChainning(String str) {
        System.out.println("Parametrize Constructor Called");
    }

    public static void main(String[] args) {
        ConstructorChainning c = new ConstructorChainning();
    }


}
