import java.util.*;
public class CommoneleinStringArray {
    public static void main(String[]args){
        String[]str={"raj","pk","roy","raj","ra"};
        String[]st={"raj","pk","ra"};
        System.out.println(Arrays.toString(str));
          System.out.println(Arrays.toString(st));
          HashSet<String>set=new HashSet<String>();
          for(int i=0;i<str.length;i++){
            for(int j=0;j<st.length;j++){
                if(str[i].equals(st[j])){
                    set.add(str[i]);
                }
            }
          }
          System.out.println(set);
    }
    
}
