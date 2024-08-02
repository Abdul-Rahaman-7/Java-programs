public class Main {
        public static void main(String[] args) {
            String str = "Hello, World!";
            String substr = "World";
            
            // Find the index of the first occurrence of "World"
            int index = str.indexOf(substr);
            
            if (index != -1) {
                System.out.println("The first occurrence of substring \"" + substr + "\" is at index: " + index);
            } else {
                System.out.println("Substring not found.");
            }
        }
    }
    
    

