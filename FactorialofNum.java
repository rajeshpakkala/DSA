import java.util.Scanner;

public class FactorialofNum {
      public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num to get factorial");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;++i){
            factorial=factorial*i;

        }
        System.out.printf("factorial of %d=%d",num,factorial);
    }
}
