
import java.util.*;

public class Arrays19 {
    public static void sortt(ArrayList<Integer> arr){
        int count1 =0;
        int count2 =0;
        int count0 =0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == 0){
                count0++;
            }else if(arr.get(i) == 1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr.set(i,0);
        }
        for(int i=count0;i<count0+count1;i++){
            arr.set(i, 1);
        }
        for(int i=count0+count1; i<arr.size();i++){
            arr.set(i,2);
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>(Arrays.asList(0,2,1,2,0,1));
        sortt(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
    
}