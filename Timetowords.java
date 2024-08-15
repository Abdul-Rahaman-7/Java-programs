public class Timetowords {
    public static void main (String [] args){
        int H=6;
        int M=0;
        String[] num={"zero","one","two","three","four","five","six","seven",
        "eight","nine","ten","eleven","twelve","thirteen", 
                            "fourteen", "fifteen", "sixteen", "seventeen", 
                            "eighteen", "nineteen", "twenty", "twenty one", 
                            "twenty two", "twenty three", "twenty four", 
                            "twenty five", "twenty six", "twenty seven", 
                            "twenty eight", "twenty nine"};

          
           String ans="";
          switch(M){
           case 0:
              ans =(num[H]+" o'clock");
              break;
          case 1:
              ans=("one minute past "+num[H]);
              break;
          case 59:
              ans =("one minute to "+num[H+1]);
              break;
          case 10:
              ans=("ten minutes past "+num[H]);
              break;
           case 15:
              ans=("quarter past "+num[H]);
             break;
          case 30:
              ans= ("half past "+num[H]);
            break;
          case 45:
              ans= ("quarter to "+num[H+1]);
             break;
              default:
              if(M>30){
              ans= (num[60-M]+" minutes to "+num[H+1]);
          } 
             else if(M<30){
                 ans=(num[M]+" minutes past "+num[H]);
                 
             }
          
    }
    System.out.println(ans);
    }
    
}
