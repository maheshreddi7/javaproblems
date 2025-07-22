
import java.util.*;

public class Arrays18 {
    public static void rotate(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("target found");
                }
            }
        } 
     
    }
    public static void main(String[] args) {
        int[] arr ={2,6,5,8,11};
        int target = 14;
        Arrays18 obj = new Arrays18();
        obj.rotate(arr,target);
    }
    
}