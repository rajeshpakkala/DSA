 import java.util.Arrays;
public class StringDuplicate {
  public static void main(String[] args) 
    {
        String[] arr = {"raj","raj","roy","pk","pk"};
 
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i].equals(arr[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }    
}

    

