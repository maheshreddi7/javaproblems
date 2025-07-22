
import java.util.*;


public class Arrays12 {
    static  ArrayList<Integer> rotate(int[] arr1,int[] arr2){
        ArrayList<Integer> lis = new ArrayList<>();
        Set<Integer> sett = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            sett.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            sett.add(arr2[i]);
        }
        for(int i : sett){
            lis.add(i);

        }
        return lis;

    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,7,8};
        int[] arr2 = {1,2,3,4,5,6};
        ArrayList<Integer> Union = rotate(arr1,arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
          System.out.print(val+" ");
    }
    
}
