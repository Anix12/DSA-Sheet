package ArrayPart4;

import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int arr[], int lp, int rp){
        //swap
        while(lp<rp){
            int temp= arr[lp];
            arr[lp]=arr[rp];
            arr[rp]=temp;
            lp++;
            rp--;
        }
    }


    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter you Array Length");
      int length=sc.nextInt();
      System.out.println("Enter Rotate Array Number");
      int rotate=sc.nextInt();
      int[] arr=new int[length];
      System.out.println("Enter your Arrays "+length+" Element");
      for(int i=0; i<length; i++){
          int a=sc.nextInt();
          arr[i]=a;
      }
      reverse(arr, 0, length-1);
      reverse(arr, 0, length-rotate-1);
      reverse(arr, length-rotate, length-1);

        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
