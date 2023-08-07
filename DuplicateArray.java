import java.util.Arrays; 
public class DuplicateArray {
  public static void main(String[] args) 
    {
       //int j=0;
     int[] arr = {1, 2, 5, 5,66,77};
    //  for(int i=0;i<arr.length;i++){
    //   if(arr[i]!=arr[i+1]){
    //    arr[j++]=arr[i];
    //  }
    //  }
    // arr[j++]=arr[arr.length-1];
   int read=1;
    int write=0;
    int n=arr.length;
    while(read<n){
      if(arr[read]==arr[write]){
        read++;
       

      }
      else{
        arr[write+1]=arr[read];
        read++;
        write++;
      }
    }
    for(int i=0;i<=write;i++){
      System.out.println(arr[i]);
    }
        
        
     }
}
