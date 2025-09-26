package ArrayPart4;

public class LongestConsecutive {
    //Brute Force Approch Added
    public static boolean findNum(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    public static int LongestCons(int arr[]) {
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 1;
            while (findNum(arr, num + 1)) {
                count++;
                num++;
            }
            maxCount=Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,3,2,1,6};
        System.out.println(LongestCons(arr));
    }
}
