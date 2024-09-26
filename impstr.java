public class impstr {
    public static void main(String [] args){
        String s="hello";
        String x="bye";
        int lens = s.length();
        int lenx = x.length();
    
        if (lenx > lens) {
            System.out.println("-1");
        }
    
    
        for (int i = 0; i <= lens - lenx; i++) {
    
            String substring = s.substring(i, i + lenx);
    
            if (substring.equals(x)) {
                System.out.println(i); 
            }
        }
    
        
        System.out.println("-1");
    }
}
