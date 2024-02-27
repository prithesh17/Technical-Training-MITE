import java.util.*;

public class Three {

    public static boolean isMajority(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate)
                count++;
        }
        return count > nums.length / 2;
    }

    public static int findMajority(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(isMajority(nums, nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Majority is : "+findMajority(arr));
        sc.close();
    }
}