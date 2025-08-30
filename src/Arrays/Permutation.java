package Arrays;

public class Permutation {


    //Optimal Solution - TC O(n) && SC O(1)
    public static int findPrivot(int arr[], int n) {
        int privot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                privot = i;
            }
        }
        return privot;
    }

    public static void swap(int arr[], int i, int privot) {
        //swap
        int temp = arr[i];
        arr[i] = arr[privot];
        arr[privot] = temp;
    }

    public static void reverseArray(int arr[], int lp, int rp) {
        while (lp <= rp) {
            //swap
            int temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = temp;
            lp++;
            rp--;
        }
    }

    public static void nextPermutation(int arr[], int n) {
        int privot = findPrivot(arr, n);

        if (privot == -1) {
            reverseArray(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > privot; i--) {
            if (arr[i] > arr[privot]) {
                swap(arr, i, privot);
                break;
            }
        }
        reverseArray(arr, privot + 1, n - 1);
    }


    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        int n = arr.length;
        nextPermutation(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
