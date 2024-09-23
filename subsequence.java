public class subsequence {
    public static void main(String [] args){
        String A="anago";
        String B="analo";
        int a = 0;
        for (int i = 0; i < B.length() && a < A.length(); i++) {
            if (B.charAt(i) == A.charAt(a)) {
                a++;
            }
        }
        System.out.println(A.length());
    }
    
}
