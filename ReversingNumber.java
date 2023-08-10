import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a num1");
        int num1=sc.nextInt();
        int reverse=0;
        while(num1!=0){
            int digits=num1%10;
            reverse=reverse*10+digits;
            num1/=10;
        }
        System.out.println(reverse);
    }
    
}
