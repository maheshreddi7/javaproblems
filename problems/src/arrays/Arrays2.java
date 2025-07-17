package arrays;




public class Arrays2 {

    public void find(int[] arr){
        int n = arr.length;
        int small = arr[0];
        int sec = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                small = arr[i];

            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<sec && arr[i] != small){
                sec = arr[i];

            }
        }
        System.out.println(small);
        System.out.println(sec);
      
    }
   
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,9,4,1};
        Arrays2 obj = new Arrays2();
        obj.find(arr);
        



    }
    
}
