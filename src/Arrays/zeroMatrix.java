package Arrays;

public class zeroMatrix {
//Brute-Force Approch
  public static void setRowAndColmZero(int arr[][], int i, int j){
      for(int col=0; col<arr.length; col++){
          if(arr[i][col]!=0){
              arr[i][col]=-1;
          }
      }
      for(int row=0; row<arr[0].length; row++){
          if(arr[row][j]!=0){
              arr[row][j]=-1;
          }
      }
  }
    public static void setMatrixZero(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==0){
                    setRowAndColmZero(arr, i, j);
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setMatrixZero(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
