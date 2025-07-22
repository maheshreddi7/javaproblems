
import java.util.Scanner;



public class Arrays11 {
    public void rotate(int[] arr,int n){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                System.out.println(n+"is present in the +"+i+"nd index");
            }
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,0,3,0,4};
        System.out.print("find number : ");
        int n = sc.nextInt();
        Arrays11 obj = new Arrays11();
        obj.rotate(arr,n);
    }
    
}