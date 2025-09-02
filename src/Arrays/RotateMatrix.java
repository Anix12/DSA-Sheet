package Arrays;

import java.util.ArrayList;

public class RotateMatrix {

    public static void rotateMatrix(int matrix[][]) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int colm=0; colm<matrix[0].length; colm++){
            ArrayList<Integer> list1=new ArrayList<>();
            for(int row=matrix.length-1; row>=0; row--){
                list1.add(matrix[row][colm]);
            }
            list.add(list1);
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=list.get(i).get(j);
            }
        }

    }

    //print Array
    public static void printArray(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       rotateMatrix(arr);
       printArray(arr);
    }
}
