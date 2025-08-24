package Arrays;

import java.util.Arrays;
public class LargestNum {

    public static int LargestNumber(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
       int arr[]={5,6,2,3,1,4};
        System.out.println(LargestNumber(arr));
    }
}
