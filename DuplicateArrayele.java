
public class DuplicateArrayele {
    public static void main(String[]args){
            int arr[]={2,2,3,4,5,56,3};
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
            for(int i=0;i<write;i++){
                System.out.println(arr[i]);
            }
    }
}
