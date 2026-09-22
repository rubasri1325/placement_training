import java.util.Scanner;

public class DifferenceFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int difference = arr[0] - arr[n - 1];

        System.out.println("Difference = " + difference);
    }
}