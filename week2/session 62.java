import java.util.Scanner;

public class Main {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n (half the array size)
        int n = sc.nextInt();

        // Read array of size 2*n
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        // Shuffle the array
        int[] result = shuffle(nums, n);

        // Print the shuffled array
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
