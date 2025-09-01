package Arrays;

public class Duplicate {

    //Brute Force Approch
    public static int DuplicateEle(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    count++;
                }
                if(count==2){
                    return i;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2};
        System.out.println(DuplicateEle(arr));
    }
}
