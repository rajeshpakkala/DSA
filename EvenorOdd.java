import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
       System.out.println("enter a num to test even or odd");
       int a=sc.nextInt();
        if(a%2==0){
            System.out.println("even num is"+a);
        }
        else{
            System.out.println("its odd");
        }
    }
    
}
