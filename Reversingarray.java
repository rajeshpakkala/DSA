import java.util.Arrays;
public class Reversingarray {
    public static void main(String[]args){
        int arr[]={3,4,5,6,7,6,44,444};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    
}
