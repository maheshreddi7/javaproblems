package arrays;

import java.util.HashSet;
import java.util.Set;

public class Arrays5 {
    public void sortt(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int j=0;
        int n = set.size();
        for (int num : set){
            arr[j++] = num;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
            
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,6};
        Arrays5 obj = new Arrays5();
        obj.sortt(arr);

    }
    
}

// public class Arrays5 {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,1,2,6};
//         Arrays5 obj = new Arrays5();
//         obj.sortt(arr);
//     }
    
// }