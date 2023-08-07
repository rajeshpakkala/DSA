import java.util.Scanner;

public class LargestnumThree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a num1"); 
        int a=sc.nextInt();
          System.out.println("enter a num12"); 
          int b=sc.nextInt();
            System.out.println("enter a num3"); 
        int c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("a is larger"+" "+a);           
}
else if(b>a&&b>c){
    System.out.println("b is larger"+" "+b);
}
else{
    System.out.println("c is larger"+" "+c);
}
    }
}