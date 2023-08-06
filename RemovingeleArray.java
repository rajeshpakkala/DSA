import java.util.Arrays;
public class RemovingeleArray{
  public static void main(String[]args){
    int []arr={3,4,5,55,6,6,777,888};
     System.out.println(Arrays.toString(arr));
    int remove=2;
    for(int i=remove;i<arr.length-1;i++){
      arr[i]=arr[i+1];
    }
    System.out.println(Arrays.toString(arr));
     
    }
}