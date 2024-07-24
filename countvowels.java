public class countvowels {
    public static void main(String [] args) {
        String word = "lion";
        int count = 0;
        

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            

            switch(ch)
            {
                case 'a': count++;
                System.out.println("a"); 
                break;
                case 'e': count++;
                System.out.println("e");
                break;
                case 'i': count++;
                System.out.println("i");
                break;
                case 'o': count++;
                System.out.println("o");
                break;
                case 'u': count++;
                System.out.println("u");
                break;
            }

        }
        System.out.println("the total vowels are:"+ count);
    }
      

}
