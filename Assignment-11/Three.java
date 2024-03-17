import java.util.*;

public class Three {

    public static int[] findUnion(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        int[] unionArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            unionArray[index++] = num;
        }
        return unionArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array a1:");
        int n = scanner.nextInt();
        int a1[] = new int[n];
        System.out.println("Enter the elements of array a1:");
        for (int i = 0; i < n; i++) {
            a1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of array a2:");
        int m = scanner.nextInt();
        int a2[] = new int[m];
        System.out.println("Enter the elements of array a2:");
        for (int i = 0; i < m; i++) {
            a2[i] = scanner.nextInt();
        }

        int U[] = findUnion(a1, a2);
        System.out.println("Union array:");
        for (int i : U) {
            System.out.print(" " + i);
        }

        scanner.close();
    }
}
