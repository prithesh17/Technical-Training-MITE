import java.util.ArrayList;
import java.util.Scanner;

class Two {
    public static ArrayList<Integer> findCommonElements(int[] ar1, int[] ar2, int[] ar3) {
        ArrayList<Integer> commonElements = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                commonElements.add(ar1[i]);
                i++;
                j++;
                k++;
            } else if (ar1[i] < ar2[j]) {
                i++;
            } else if (ar2[j] < ar3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return commonElements;
    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] ar1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            ar1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] ar2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            ar2[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] ar3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            ar3[i] = sc.nextInt();
        }
        ArrayList<Integer> commonElements = findCommonElements(ar1, ar2, ar3);
        System.out.print("Common elements: ");
        for (int i = 0; i < commonElements.size(); i++) {
            System.out.print(commonElements.get(i) + " ");
        }
        sc.close();
    }
}
