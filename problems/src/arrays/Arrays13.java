
import java.util.Arrays;


public class Arrays13 {
    public static int rotate(int[] arr){
        int[] hash = new int[arr.length + 1];
        for(int i=0;i<arr.length-1;i++){
            hash[arr[i]]++;
        }
        System.out.println(Arrays.toString(hash));
        for(int i=0;i<arr.length;i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
     
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int ans = rotate(arr);
        System.out.println(ans);
    }
    
}