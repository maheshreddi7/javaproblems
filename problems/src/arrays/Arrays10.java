import java.util.ArrayList;



public class Arrays10 {
    public static  int[] moveZeroes(int[] arr,int n){
      ArrayList<Integer> lis = new ArrayList<>();
      for(int i=0;i<n;i++){
        if(arr[i] !=0){
            lis.add(arr[i]);
        }
      }
      int sizee = lis.size();
      for(int i=0;i<sizee;i++){
        arr[i] = lis.get(i);
      }
      for(int i=sizee;i<n;i++){
        arr[i] = 0;
      }

      return arr;


       
      
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        Arrays10 obj = new Arrays10();
        int[] ans =  moveZeroes(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        
    }
    
}



// public class Arrays10 {
//     public void rotate(int[] arr){

       
      
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = {1,2,0,3,0,4};
//         Arrays10 obj = new Arrays10();
//         obj.rotate(arr);
//     }
    
// }
