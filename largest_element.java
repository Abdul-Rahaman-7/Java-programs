// finding largest element in an array
import java.util.Arrays;
public class largest_element {
    public static void main (String[]args){
        int [] num = {67,54,89,48,75};

        Arrays.sort(num);
        int i = num.length-1;
        System.out.println("The largest element of array is "+num[i]);


    }

}
