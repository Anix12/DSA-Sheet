package Cognizant;

import java.util.Scanner;

public class NthSuquenceQ11 {

    public static void GenerateSeq(int arr[], int length) {
        for (int i = 6; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int length = Sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i <= 6; i++) {
            arr[i] = i+1;
        }
        GenerateSeq(arr, length);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
