class Minimuminarray{
public int minimumvalue(int []arr){
    //edgecases
    if(arr==null || arr.length==0){
        throw new IllegalArgumentException("Enter proper value");
    }
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
    }
} return min;
}
}
public class MinimumValueinArray{
    public static void main(String[]args){
        int arr[]={22,33,44,2,4,5,6,77};
        Minimuminarray ma=new Minimuminarray();
         System.out.println(ma.minimumvalue(arr));
      

    }
}