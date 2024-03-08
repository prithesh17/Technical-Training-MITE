import java.util.Scanner;

class Main {
    public static void findTripletSum(int[] arr, int X) {
        int n = arr.length;
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == X) {
                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No triplet found with sum " + X);
        }
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        findTripletSum(ar,x);
        sc.close();
    }
}
