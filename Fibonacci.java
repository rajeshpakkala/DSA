import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        int num=0;
        int num1=1;
          Scanner sc=new Scanner(System.in);
        System.out.println("enter a num to get fibonacci");
        int n=sc.nextInt();
        int num3;
        for(int i=0;i<n;++i){
            System.out.println(num);
     
        num3=num+num1;
        num=num1;
        num1=num3;
       
    }

}
    
}
