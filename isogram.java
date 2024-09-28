import java.util.Arrays;

public class isogram {
    public static void main(String[] args) {
        String data = "machine";
        char[] ch = data.toCharArray();
        Arrays.sort(ch);
        for (int i = data.length() - 1; i > 0; i--) {
            if (ch[i] == ch[i - 1])
                System.out.println("0");
            break;
        }
        System.out.println("1");
    }
}
