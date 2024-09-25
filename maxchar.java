import java.util.Scanner;

public class maxchar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String line = scanner.nextLine().toLowerCase(); // Convert to lowercase to handle case-insensitivity

        int[] arr = new int[26]; // Array to count occurrences of each letter
        int maxIndex = 0;
        int max = 0;

        // Count occurrences of each character
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') { // Check if it's a lowercase letter
                int index = currentChar - 'a';
                arr[index]++;
            }
        }

        // Find the character with the maximum frequency
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                maxIndex = i;
                max = arr[i];
            }
        }

        // Output the character with the maximum frequency
        char mostFrequentChar = (char) (maxIndex + 'a');
        System.out.println("Most frequent character: " + mostFrequentChar);
        System.out.println("Frequency: " + max);
        
        scanner.close();
    }
    
}
