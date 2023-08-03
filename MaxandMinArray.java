class Min{
    public int method(int []arr){
    if(arr==null || arr.length==0){
        throw new IllegalArgumentException("enter proper values");
    }
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
    if(arr[i]<min){
        min=arr[i];
    }
}return min;
}

 public int methodd(int []arr){
    if(arr==null || arr.length==0){
        throw new IllegalArgumentException("enter proper values");
    }
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}return max;
}
}


public class MaxandMinArray {
    public static void main(String[]args){
int []arr={3,4,5,6,6,777,7888,4333,5,6,777,1};
Min obj=new Min();
System.out.println(obj.method(arr));
System.out.println(obj.methodd(arr));
    
}
}
