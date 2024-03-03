import java.util.Scanner;

class Three {
    public static char nonrepeatingCharacter(String S) {
        int[] frequency = new int[26];
        for (char ch : S.toCharArray()) {
            frequency[ch - 'a']++;
        }
        for (char ch : S.toCharArray()) {
            if (frequency[ch - 'a'] == 1) {
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char result = nonrepeatingCharacter(input);
        if (result == '$') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
        sc.close();
    }
}
