import java.util.Scanner;

public class ProductofFloatingNums {
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num1");
        float num1=sc.nextInt();
        System.out.println("num1 is"+num1);
    System.out.println("enter a num2 ");
        float num2=sc.nextInt();
        System.out.println("num2 is"+num2);

        float product=0;
        product=num1*num2;
        System.out.println("product is"+product);
    
}
}
