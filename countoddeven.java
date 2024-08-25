public class countoddeven {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5};
        int counteven=0;
        int countodd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                counteven+=1;
            }
            else {
                countodd+=1;
            }
        }
        System.out.println("odd="+countodd+"even="+counteven);
        
    }
}
