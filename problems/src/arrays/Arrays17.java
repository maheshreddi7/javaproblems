
import java.util.*;

public class Arrays17 {
    public static void rotate(int[] arr){
       int[] hash  = new int[arr.length];
       for(int i=0;i<arr.length;i++){
          hash[arr[i]]++;

       }
       for(int i=0;i<hash.length;i++){
          if(hash[i] == 1){
              System.out.println(i);
            
        }
       }
       

        
     
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,0,1,1,0,1};
        Arrays17 obj = new Arrays17();
        obj.rotate(arr);
    }
    
}