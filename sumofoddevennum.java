public class sumofoddevennum {
    public static void main (String [] args){
        int n = 5;
        int evensum = 0;
        int oddsum = 0;
        
        for(int i=0;i<=n;i++){
            if(i%2==0){
                evensum +=i;
            }
            else{
                oddsum +=i;
            }
            
        }
        System.out.println(oddsum+" "+evensum);
    } 
    
}
