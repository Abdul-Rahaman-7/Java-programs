public class indexofcharacteratstring {
    public static void main(String [] args){
        String s = "Hello World";
        String p = "W";
        
        // Ensure p contains only one character
        if (p.length() != 1) {
            System.out.println("Please provide a single character as the search string.");
            return;
        }
        
        char searchChar = p.charAt(0);
        boolean found = false;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (searchChar == s.charAt(i)) {
                System.out.println(i);
                found = true;
                break; // If you only want the first occurrence from the end
            }
        }
        
        if (!found) {
            System.out.println("Character is not present");
        }
    }
    
}
