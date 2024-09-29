public class camelcase {
    public static void main (String [] args){
        String s="aBcDE";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
