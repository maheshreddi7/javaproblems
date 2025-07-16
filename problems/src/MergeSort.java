
import java.util.ArrayList;

public class MergeSort {


    
    public static void merge(int[] arr,int low ,int mid,int high){

        ArrayList<Integer> lis = new ArrayList<>();
        int left  = low;
        int right = mid + 1;


        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                lis.add(arr[left]);
                left++;
            }else{
                lis.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            lis.add(arr[left]);
            left++;
        }
        while(right<=high){
            lis.add(arr[right]);
            right++;
        }
        System.out.println(lis);
        System.out.println(low);
        for (int i = low; i <= high; i++) {
            arr[i] = lis.get(i - low);
        }
        
        
    }
    public static  void mergeSort(int[] arr, int low ,int high){
        if(low >= high){
            return;
        }
        int mid  = (low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        obj.mergeSort(arr,0,n-1);
        System.out.println("After sorting sorting : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
            
        }
        
        
    }

    
    
}
