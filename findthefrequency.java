public class findthefrequency {
    public static void main(String [] args){
        int [] Arr={1,2,1,3,1,4};
        int X=1;
        int count=0;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i] == X){
                count ++;
            }
        }
        System.out.println("the frequency of "+X+" is "+count);
    }    
}
