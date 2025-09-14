package Cognizant;

public class DopaminLevel {

    public static String DopamainLevel(int arr[], int l, int r) {
        int MaxDopamain = 0;
        int MinDopamain = 0;
        int Dopamin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= l && arr[i] <= r) {//that means in range
                Dopamin++;
                MaxDopamain=Math.max(MaxDopamain, Dopamin);
            } else {
                Dopamin--;
                MinDopamain = Math.min(MinDopamain, Dopamin);
            }
        }
        return MaxDopamain + " " + MinDopamain;
    }

    public static void main(String[] args) {
        int arr[] = {9, 3, 5};
        int l = 1;
        int r = 4;
        System.out.println(DopamainLevel(arr, l, r));
    }
}
