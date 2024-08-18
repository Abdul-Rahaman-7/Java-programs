public class arraysearch {
    public static void main (String [] args){
        int [] arr={23,45,7,17,25};
        int x = 7;
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("x is present in the index of"+i);
                found =true;
                break;
            }
        }
        if(!found){
            System.out.println("x is not found");
        }

    }
    
}
