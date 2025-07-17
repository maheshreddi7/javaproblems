package arrays;
public class Array3 {
    static  boolean  check(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        Array3 obj = new Array3();
        if(obj.check(arr)){
        System.out.println("sorted");
        }else{
        System.out.println("unsorted");

        }
    }
}
