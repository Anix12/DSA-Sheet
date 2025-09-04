package ArrayPart3;
import java. util.Arrays;
public class MajorityElement {
    //Brute Force Approch

    //Optimal Approch Tc-O(n)
    public static int MostOccurElement(int nums[], int n){
        Arrays.sort(nums);
        return nums[n/2];
    }


    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        int n=nums.length;
        System.out.println(MostOccurElement(nums, n));
    }
}
