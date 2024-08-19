public class longestString {
    public static void main (String [] args){
        String [] arr={"Greeks","Greeksfor","Greeksforgreeks"};
        int longest = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[longest].length() < arr[i].length()){
                longest = i;
            }
        }
        System.out.println(arr[longest]);
    }
    
}
