import java.util.Arrays;

public class InsertintoArray {
    public static void main(String[]args){
        int []arr={2,34,55,66,77,44,55,444};
        int []a=new int[8];
        System.out.println(Arrays.toString(arr));
       
        for(int i=0;i<=arr.length-4;i++){
            a[i]=arr[i];
        }
        System.out.println(Arrays.toString(a));
        a[5]=4444;

        
        for(int i=6;i<=arr.length-1;i++){
            a[i]=arr[i];
        }
        System.out.println(Arrays.toString(a));
    }
    
}
