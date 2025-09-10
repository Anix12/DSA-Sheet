public class Java {
    public static void Reverse(int num){
        int duplicate=num;
        int reverse=0;

        while(duplicate>0){
            int temp=duplicate%10;
            reverse=reverse*10+temp;
            duplicate/=10;
        }
        if(reverse == num){
            System.out.println("Palindrom Number");
        }else{
         System.out.println("Not Palindrome Number");
        }
    }
    public static void main(String[] args) {
        int num=1212;
        Reverse(num);
    }
}
