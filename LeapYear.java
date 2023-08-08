import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year here you want check");
        int year=sc.nextInt();
        boolean flag=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                   flag=true;
                   else
                   flag=false;
                }
                   else
                   
                    flag=true;
                   }
                   else
                   
                    flag=false;
                   
                   
                if(flag){
                    System.out.println(year+" "+"leap year");
                }
                else{
                    System.out.println("not leap year");
                }

            }
                }
            
        
    
    
