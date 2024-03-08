import java.util.Scanner;

import tools.ArrayMethod;

class One {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        ArrayMethod.reverse(arr, 0, n - 1);
        ArrayMethod.reverse(arr, 0, k - 1);
        ArrayMethod.reverse(arr, k, n - 1);
    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateArray(a,k);
        ArrayMethod.printArray(a);
        sc.close();
    }
}
