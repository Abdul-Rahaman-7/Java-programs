//Swapping withoutthird variable
public class Swap2num1 {
    public static void main(String [] args){
        int a = 5;
        int b = 6;

        System.out.println("Before Swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    
}
