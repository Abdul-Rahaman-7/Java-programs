//Finding the prime number
public class primenumber {
    public static void main (String [] args) {
        int a = 15;
        boolean isprime = true;

        for(int i=2;i<a;i++){
            if(a%i==0 && a%1==0){  
                isprime = false;
                break;
            }

            if(isprime){
                System.out.println("prime");
            }

            else{
            System.out.println("not prime");
            }



        }


        

        
    }
    
}
