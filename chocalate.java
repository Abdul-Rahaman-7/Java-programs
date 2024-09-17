public class chocalate {
    public static void main(String [] args){
        int [] arr={5,3,4,6,2,1};
        int n=6;
        int left=0, right=n-1;
        while(left<right){
            if(arr[left]>arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(arr[left]);

    }    
}
