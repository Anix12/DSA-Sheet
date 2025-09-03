package Arrays;

import java.util.ArrayList;

public class RotateMatrix {
    //Brute Force Approch
    public static void rotateMatrix(int matrix[][]) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int colm = 0; colm < matrix[0].length; colm++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int row = matrix.length - 1; row >= 0; row--) {
                list1.add(matrix[row][colm]);
            }
            list.add(list1);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = list.get(i).get(j);
            }
        }
    }

    //Optimal Approch
    public static void rotateMat(int arr[][]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {

                    swap(arr, i, j);
            }
        }
        reverseArray(arr);
    }

    public static void reverseArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int lp = 0;
            int rp = arr[0].length-1;
            while (lp < rp) {
                //swap
                int temp = arr[i][lp];
                arr[i][lp] = arr[i][rp];
                arr[i][rp] = temp;
                lp++;
                rp--;
            }
        }
    }

    public static void swap(int arr[][], int i, int j) {
        //swapping Function
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    //print Array
    public static void printArray(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        rotateMat(arr);
        printArray(arr);
    }
}
