import java.util.Scanner;
public class One {
    public static int celebrity(int[][] M, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (M[i][j] == 1) {
                    break;
                } else if (j == (N - 1)) {
                    if (M[i][j] == 0) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix m1:");
        int n1 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix m1:");
        int m1Columns = scanner.nextInt();
        int[][] m1 = new int[n1][m1Columns];
        System.out.println("Enter the elements of matrix m1:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1Columns; j++) {
                m1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number of rows for matrix m2:");
        int n2 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix m2:");
        int m2Columns = scanner.nextInt();
        int[][] m2 = new int[n2][m2Columns];
        System.out.println("Enter the elements of matrix m2:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2Columns; j++) {
                m2[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }
}