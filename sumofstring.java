public class sumofstring {
    public static void main(String [] args){
        String str = "12gfg5";
        int sum=0;
        String temp="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            
            if(Character.isDigit(ch)){
                temp += ch;
            }
            else{
                if(!temp.isEmpty()){
                    sum += Long.parseLong(temp);
                    temp ="";
                    
                }
            }
        }
        if (!temp.isEmpty()) {
            sum += Long.parseLong(temp);
        }
        System.out.println(sum);
    }
    
}

