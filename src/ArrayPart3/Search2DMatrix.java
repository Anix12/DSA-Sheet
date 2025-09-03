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


    public static void main(String[] args) {
        int matrix[][]={
                {1 ,2 ,3 ,4},
                {5 ,6 ,7 ,18},
                {9 ,10 ,11 ,12}
        };
        int target=8;
        System.out.println(matrixSearch(matrix, target));
    }
}
