package arrays;

import java.util.Arrays;

public class Arrays1 {

    // public void find(int[] arr){
    //     int max = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max = arr[i];
    //         }
    //     }
    //     System.out.println(max+" " + "is the largest element in the array");

    // }
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,9,4,1};
        // Arrays1 obj = new Arrays1();
        // obj.find(arr);

        //sorting method
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }
    
}
