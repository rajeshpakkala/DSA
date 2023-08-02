import java.util.Arrays;
import java.util.Scanner;
class Arry{
    public void show(){
    int a[]={3,4,55,66,55};
    Arrays.sort(a);
        System.out.println(Arrays.toString(a));
}
public void toStr(){
    String str[]={"raj","roy","mbu"};
    Arrays.sort(str);
    System.out.println(Arrays.toString(str));
}
}
public class ArrayStringSort {
    public static void main(String[]args){
        Arry obj=new Arry();
        obj.show();
        obj.toStr();
        /*  int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<arr.length;i++){
           System.out.println("enter elements in array");
            arr[i]=sc.nextInt();
           
        }
           System.out.println("elements in array");
        for(int i=0;i<arr.length;i++){
        
           System.out.println((arr[i]));
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        
    }
    
}
