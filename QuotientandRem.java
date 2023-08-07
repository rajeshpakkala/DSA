import java.util.Scanner;
public class QuotientandRem {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num1");
        int a=sc.nextInt();
        System.out.println("enter a num2");
        int b=sc.nextInt();
        int c=a/b;
    
        int d=a%b;
        System.out.println("quotient is"+c);
        System.out.println("rem is"+d);

    }
    
}
