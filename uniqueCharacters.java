import java.util.HashSet;
import java.util.LinkedHashSet;

public class uniqueCharacters {

    public static void main(String[] args) {
        String str = "programming";
        printUniqueCharacters(str);
    }

    public static void printUniqueCharacters(String str) {
        HashSet<Character> seen = new HashSet<>();
        LinkedHashSet<Character> unique = new LinkedHashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                unique.add(ch);
            } else {
                unique.remove(ch);
            }
        }
        
        for (char ch : unique) {
            System.out.print(ch);
        }
    }
}

