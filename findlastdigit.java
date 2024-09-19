import java.util.Scanner;
public class findlastdigit {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        if(n>=0){
            n = n%10;
            System.out.println(n);
        }
        else if(n<0){
            n = n%10;
            System.out.println(n*(-1));
        }
    }
    
}
