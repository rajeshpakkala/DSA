import java.util.Scanner;

public class ChracterorNot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a char or num or special symbol");
        char ch=sc.next().charAt(0);
       
        //if(ch=='a' || ch=='b' || ch=='a' || ch=='b' || ch=='c' || ch=='d' || ch=='e' || ch=='f' || ch=='g' || ch=='h' || ch=='i' || ch=='j' || ch=='k' || ch=='l' || ch=='m' || ch=='n' || ch=='o' || ch=='p' || ch=='q' || ch=='r' || ch=='s' || ch=='t' || ch=='u' || ch=='v' || ch=='w' || ch=='x' || ch=='y' || ch=='z'){
           if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("you entered  Alphabet is" +" "+ch);
        }

        /*
         int a=sc.nextInt();
         else if(a==0||a==1 || a==2 || a==3 || a==4 || a==5 || a==6 ||a==7 || a==8 || a==9) {
          //  System.out.println("you entered numvis ");
        }*/
        else{
            System.out.println("you entered a num or special character");
        }
    }
    
}
