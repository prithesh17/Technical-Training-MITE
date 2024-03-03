import java.util.Arrays;
import java.util.Scanner;

class Two {
    public static void find_permutation(String S) {
        char[] chars = S.toCharArray();
        Arrays.sort(chars);
        S = new String(chars);
        permutation("", S);
    }

    public static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                    permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        find_permutation(input);
        sc.close();
    }
}
