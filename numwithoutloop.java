public class numwithoutloop {
    public static void main(String [] args){
        int N = 8;
        printNos(1, N);
    }

    // Recursive method to print numbers from 1 to N
    public static void printNos(int current, int N) {
        if (current <= N) {
            System.out.print(current + " ");
            printNos(current + 1, N);
        }
    }
}

