import java.util.Arrays;

public class CopyingArray {
    public static void main(String[]args){
   int []arr={3,4,5,6,7,5,444};
   int newarr[]=new int[7];
   System.out.println("old arr"+Arrays.toString(arr));
   for(int i=0;i<arr.length;i++){
    newarr[i]=arr[i];
   }
   System.out.println("new arrays"+Arrays.toString(newarr));
    }
}
