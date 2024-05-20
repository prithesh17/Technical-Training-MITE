import java.util.Scanner;

import tools.ArrayMethod;

class Three {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void rearrangeArray(int[] arr) {
        int primeIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                int temp = arr[primeIndex];
                arr[primeIndex] = arr[i];
                arr[i] = temp;
                primeIndex++;
            }
        }
    }

     public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        rearrangeArray(a);
        ArrayMethod.printArray(a);
        sc.close();
    }
}
