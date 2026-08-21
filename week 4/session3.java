import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println("Duplicate element found: " + num);
                duplicate = true;
                break;
            }

            set.add(num);
        }

        if (!duplicate) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
output
    Duplicate element found: 20
