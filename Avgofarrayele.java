import java.util.Scanner;

public class Avgofarrayele {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
         
        for(int i=0;i<a.length;i++){
            System.out.println("enter array elemetns");
            a[i]=sc.nextInt();
        }
        
         System.out.println("array elemetns");
          for(int i=0;i<a.length;i++){
           
            System.out.println(a[i]);
        }
        double avg;
        int sum=0;
        for(int i:a)
            sum=sum+i;
             System.out.println("sum is"+sum);
             avg=sum/a.length;
             System.out.println("avg is"+avg);
        
           

    }
    
}
