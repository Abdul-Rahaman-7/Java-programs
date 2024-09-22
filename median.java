import java.util.Arrays;
public class median {
    public static void main(String [] args){
        int n=5;
        int[] v={90,100,78,89,67};
        Arrays.sort(v);
        if(v.length%2 !=0){
            int k = v.length/2;
            System.out.println(v[k]);
        }
        else{
            int say = v.length/2;
            int k = (v[say]+v[say-1])/2;
            System.out.println(k);
        }

    }
    
}
