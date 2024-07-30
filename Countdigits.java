public class Countdigits {
    public static void main (String [] args){

        int givennumber = 673048;
        int outnumber = 0;

        while(givennumber > 0){

            givennumber = givennumber/10;
            
            outnumber++;

        }
        System.out.println(outnumber);
    }
    
}
