import java.util.*;
public class Arraycontains {
    public static boolean method(int []arr,int item){
        for(int n:arr){
            if(item==n){
            return true;
        }
    
    }
    return false;
}
    public static void main(String[]args){
        int ar[]={3,4,5,6,75,5};
     
        System.out.println(method(ar,5));
           System.out.println(method(ar,4445));
    }
    
}
