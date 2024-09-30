public class concatenaterev {
    public static void main (String [] args){
        String S1="Hello";
        String S2="World";
        String new_String=S1+S2;
        String rev_String="";
        for(int i=new_String.length()-1;i>=0;i--){
            rev_String=rev_String+new_String.charAt(i);
        }
        System.out.println(rev_String);
    }
    
}
