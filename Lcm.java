public class Lcm {
    public static void main(String[]args){
        int num1=72;
        int num2=300;
        int gcd=1;
        for(int i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0&&num2%i==0)
            gcd=i;

        }
        int lcm=(num1*num2)/gcd;
        System.out.printf("LCM of %d and %d is %d",num1,num2,gcd);

    }
    
}
