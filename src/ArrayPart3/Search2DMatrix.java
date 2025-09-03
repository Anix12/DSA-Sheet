package ArrayPart3;

public class Search2DMatrix {
    //Brute-Force Approch with O(n^2) Tc and Sc O(1)
    public static boolean matrixSearch(int matrix[][], int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(target==matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    //optimal Solution Tc-O(n)
    public static boolean search2DMat(int arr[][], int target){
        int row=0, colm=arr[0].length-1;
        while (row<=arr.length && colm>=0){
            if(target==arr[row][colm]){
                return true;
            } else if (target>arr[row][colm]) {
                row++;
            }else{
                colm--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int matrix[][]={
                {1 ,2 ,3 ,4},
                {5 ,6 ,7 ,8},
                {9 ,10 ,11 ,12}
        };
        int target=8;
        System.out.println(search2DMat(matrix, target));
    }
}
