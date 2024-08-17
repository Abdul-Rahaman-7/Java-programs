import java.util.HashSet;
import java.util.Set;

public class unionoftwoarray {
    public static void main(String [] args){
        int count=0;
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3};
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(set.add(arr1[i])){
                count++;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(set.add(arr2[i])){
                count++;
            }
    }
    System.out.println(count);
    }
    
}
