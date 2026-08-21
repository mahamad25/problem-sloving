import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(
                    "Pair found: " + arr[left] + " + " + arr[right]
                );
                found = true;
                break;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}
output
    Pair found: 1 + 9
    
