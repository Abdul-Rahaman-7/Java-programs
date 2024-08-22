public class Sortedarraysearch {
    public static void main(String [] args){
        int [] arr={5,8,10,9};
        int K=10;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==K){
                found = true;
                break;
            }
        }
            if(found){

                System.out.println("arr element is equal to K");
            }
            else{
                System.out.println("arr element is not equal to K");
            }
            
            
        }
}
