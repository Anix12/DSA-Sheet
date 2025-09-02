package Arrays;

public class MergeArray {
    //Merge two Sorted Arrays Without Extra Space

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int len = arr1.length + arr2.length;
        int[] arr3 = new int[len];

        int lp = 0, rp = 0, i = 0;
        while (lp < arr1.length && rp < arr2.length) {
            if (arr1[lp] < arr2[rp]) {
                arr3[i] = arr1[lp];
                lp++;
            } else {
                arr3[i] = arr2[rp];
                rp++;
            }
            i++;
        }
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }
    }

}