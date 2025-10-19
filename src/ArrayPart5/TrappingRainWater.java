package ArrayPart5;

public class TrappingRainWater {

    public static int trappingWater(int arr[]) {
        int n = arr.length - 1;
        int leftHeight[] = new int[n];
        leftHeight[0] = arr[0];
        //left height find
        for (int i = 1; i < n; i++) {
            leftHeight[i] = Math.max(leftHeight[i - 1], arr[i]);
        }
        //right height find
        int rightHeight[] = new int[n];
        rightHeight[n-1]=arr[n-1];
        for (int i = n - 2; i >= 0; i--) {
            rightHeight[i] = Math.max(arr[i], rightHeight[i + 1]);
        }

        //water Level Find
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftHeight[i], rightHeight[i]);
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingWater(arr));
    }
}
