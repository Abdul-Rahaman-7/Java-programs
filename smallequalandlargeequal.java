public class smallequalandlargeequal {
    public static void main(String [] args){
        int [] arr={1,2,3,6,8,8,9,12,14};
        int x=8;
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                a++;
            }
            if(arr[i]>=x){
                b++;
            }
        }
        System.out.println("Smallestandequal="+a+"largestandequal="+b);
    }
}
