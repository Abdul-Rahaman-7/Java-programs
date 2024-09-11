public class setbit {
    public static void main(String [] args){
        int N=2;
        int index =1;
       if((N&(N-1))!=0){
        System.out.println("-1");
       }
        while(N>0){
            int check = N&1;
            if(check==1){
            System.out.println(index);
            }
            index++;
            N=N>>1;
        }
        System.out.println("-1");
    }
    
}
