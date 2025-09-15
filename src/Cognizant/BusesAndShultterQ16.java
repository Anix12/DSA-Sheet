package Cognizant;

import java.util.Scanner;

public class BusesAndShultterQ16 {

    public static int totalExpense(int people, int busFuel, int shultterFuel) {
        int bus = 80;
        int shultter = 8;
        int totalCost = 0;
        while (people > 0) {
            if (people >= bus) {
                totalCost += 75 * busFuel;
                people -= bus;
            } else {
                totalCost += 75 * shultterFuel;
                people -= shultter;
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter Total Number of People");//240
//        int tot_People = Sc.nextInt();
//        System.out.println("Enter Bus Fuel Cost"); //50
//        int bus = Sc.nextInt();
//        System.out.println("Enter Shultter Fuel Cost"); //8
//        int shultter = Sc.nextInt();
        System.out.println(totalExpense(95, 60, 10));

    }
}
