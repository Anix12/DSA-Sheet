package ArrayPart4;

public class KaprekarNumber {

    public static boolean KaprekarNum(int num) {
        int squ=num*num;
        int sum=0;
        while (squ > 0) {
            int temp=squ%10;
            sum+=temp;
            squ/=10;
        }
        System.out.print(sum);
        return num == sum;
    }


    public static void main(String[] args) {
        int p = 1, q = 100;
        int num=9;
        System.out.println(KaprekarNum(num));
    }
}
