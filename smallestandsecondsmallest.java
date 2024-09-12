public class smallestandsecondsmallest {
    public static void main (String [] args){
        int [] arr={2,4,3,5,6};
        int smallest = arr[0];
        int Ssmallest = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < smallest){
                arr[i] = smallest;
                Ssmallest = smallest;
            }
            else if(arr[i] != smallest && arr[i] < Ssmallest){
                Ssmallest = arr[i];
            }
        }
        System.out.println("smallest = "+ smallest+"Secondsmallest = "+Ssmallest);
    }
    
}
