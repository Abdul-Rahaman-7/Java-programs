public class countsmallelements {
    public static void main(String [] args){
        int [] arr={3,4,7,8,9,2};
        int x=8;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                count ++;
            }
        }
        System.out.println(count);
    }
    
}
