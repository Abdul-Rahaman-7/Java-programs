public class Fibonacci {
    public static void main (String [] args){

        int no1 = 0;
        int no2 = 1;

        int sum;

        for(int i=1;i<11;i++){
            sum = no1 + no2;
            System.out.println(sum);
            no1 = no2;
            no2 = sum;

        }

    }
    
}
