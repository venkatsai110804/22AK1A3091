import java.util.Scanner;

public class Program4 {
    public static void main(String args[]) {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Reveresed words:" + reverseEachWord(input));
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }
        return reversedString.toString().trim();
    }

}