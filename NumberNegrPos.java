import java.util.Scanner;

public class NumberNegrPos {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num here you want check");
        float  num=sc.nextFloat();  
         if(num>0.0){
            System.out.println("positive");
         } 
         else if(num<0.0){
            System.out.println("negative");
         }
         else{
            System.out.println("its equal to zero");
         }
}
}