import java.util.Scanner;
public class One {
    public static int countSpecialCharacters(String str) {
        int specialCharCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        return specialCharCount;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countSpecialCharacters(str));
        sc.close();
    }
}
