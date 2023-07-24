class Maxvalue{
    public int maximumvalue(int []arr){
        //edge cases
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
public class MaximumValueinArray {
    public static void main(String[]args){
        int arr[]={22,33,44,55,66,77,88,99};
        Maxvalue mx=new Maxvalue();
        System.out.println(mx.maximumvalue(arr));
    }
    
}
