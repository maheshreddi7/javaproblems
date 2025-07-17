package arrays;


import java.util.Arrays;
import java.util.Scanner;



public class Arrays6 {
    public void rotate(int[] arr,int k){
        int[] temp = new int[k];
        int n = arr.length;
        for(int i=n-k;i<n;i++){
            temp[i-n+k] = arr[i];
        }
        for(int i = n-k-1;i>=0;i--){
            arr[i+k] = arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i] =temp[i];
        }

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        int k = 2;
        Arrays6 obj = new Arrays6();
        obj.rotate(arr,k);
    }
    
}



// public void rotate(int[] arr){
//     int n = arr[0];
//     for(int i=0;i<arr.length-1;i++){
//         arr[i] = arr[i+1];
//     }
//     arr[arr.length - 1] = n;
//     System.out.println(Arrays.toString(arr));
    

// }


// public void rotate(int[] arr){
//     int[] temp = new int[arr.length];
//     for(int i =1;i<arr.length;i++){
//         temp[i-1] = arr[i];

//     }
//     temp[arr.length-1] = arr[0];

//     System.out.println(Arrays.toString(temp));

// }