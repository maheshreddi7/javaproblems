
import java.util.*;
import javax.lang.model.element.Element;

public class Arrays20 {
    public static void rotate(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low <=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                System.out.println("found"+" " + mid);
                break;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low  = mid+1;
            }
        }
        
     
    }
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,7,8,9,11,24};
        int target = 5;
        Arrays20 obj = new Arrays20();
        obj.rotate(arr,target);
    }
    
}