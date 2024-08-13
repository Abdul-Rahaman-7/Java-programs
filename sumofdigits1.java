public class sumofdigits1 {
    public static void main(String [] args){
        int N = 69;
        int sum = 0;
        while(N>0){
            int rem =N%10;
            sum += rem;
            N=N/10;
            }
        System.out.println("The sum of N is:"+sum);
    }

}
