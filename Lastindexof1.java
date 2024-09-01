public class Lastindexof1 {
    public static void main(String [] args){
        String s="00001";
        String o="1";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==o.charAt(0)){
                System.out.println("1 is present in the "+i+" index") ;
            }
            }
        
    }
}

