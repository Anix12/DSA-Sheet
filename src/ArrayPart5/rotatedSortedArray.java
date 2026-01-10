package ArrayPart5;

public class rotatedSortedArray {

    public static void SortedArraySquare(int arr[]) {
        int i = 0, j = arr.length - 1;
        int temp[] = new int[arr.length];
        int pointer=arr.length-1;
        while (i < j) {
            int first = arr[i] * arr[i];
            int second = arr[j] * arr[j];
            if (first > second || first == second) {
                temp[pointer--] = first;
                i++;
            } else {
                temp[pointer--] = second;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        //[0,1,9,16,100]
        SortedArraySquare(arr);
    }
}
