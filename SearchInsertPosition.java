import java.util.Scanner;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return left; // insert position
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements of the array (sorted): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking target input
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        int pos = sol.searchInsert(nums, target);

        System.out.println("Output: " + pos);
    }
}
