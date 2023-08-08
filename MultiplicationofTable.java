import java.util.Scanner;

public class MultiplicationofTable {
     public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num to get multiply");
        int c=sc.nextInt();
        int result=1;
        for(int i=1;i<=10;i++){
         result=c*i;
         System.out.println(c+" "+"x"+" "+i+" "+"="+result);
        }
      
}
}