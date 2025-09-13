package Cognizant;

import java.util.Stack;

public class PulseCount {
    //Pop The Element and Count their frequency in Stack

    public static int PulseCount(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] >= s.peek()) {
                count++;
                s.pop();
            }
            s.push(arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        System.out.println(PulseCount(arr));
    }
}
