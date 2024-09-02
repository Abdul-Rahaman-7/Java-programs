public class secondlargest {
    public static void main(String [] args){
        int [] arr={2,5,4,9,3};
        int largest=arr[0];
        int Slargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>Slargest){
                Slargest=arr[i];
            }
        }
        System.out.println("The Second largest number is "+Slargest);
    }
    
}
