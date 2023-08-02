public class Indexofarray {
    public static int index(int arr[],int t){
            if(arr==null){
            return -1;
    }
    int i=0;
    while(i<arr.length){
        if(arr[i]==t){
            return i;
        }
        else{
        i=i+1;
        }
    }
    return -1;
}

    public static void main(String[]args){
        int arr[]={3,4,5,5,6,55};
        System.out.println(index(arr,5));
       
    }
    
}
