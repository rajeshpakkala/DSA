import java.util.Scanner;

public class SumofNaturalnums {
      public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a nat num upto u get sum");
        int c=sc.nextInt();
        int sum=0;
    for(int i=0;i<c;i++){
         sum+=i;
        }
        System.out.println(sum);
    }
}
