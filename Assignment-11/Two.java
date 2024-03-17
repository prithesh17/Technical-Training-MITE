import java.util.Scanner;

public class Two {
    public static int isValid(String S) {
        String[] parts = S.split("\\.");
        if (parts.length > 4) {
            return 0;
        } else {
            for (String part : parts) {
                int IntPart = Integer.parseInt(part);
                if (part.length() > 3) {
                    return 0;
                } else if (!(IntPart >= 0 && IntPart <= 255)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an IP address:");
        String adrs1 = scanner.nextLine();
        System.out.println("Enter another IP address:");
        String adrs2 = scanner.nextLine();

        System.out.println("Validity of first IP address: " + isValid(adrs1));
        System.out.println("Validity of second IP address: " + isValid(adrs2));

        scanner.close();
    }
}
