public class minandmax {
    public static void main(String [] args){
        int [] arr={16,45,98,34,21};
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max"+max+",Min"+min);
    }
    
}
