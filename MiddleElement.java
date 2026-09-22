import java.util.Scanner;

public class MiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n % 2 == 1) {
            System.out.println("Middle element: " + arr[n / 2]);
        } else {
            System.out.println("Middle elements: " +
                    arr[n / 2 - 1] + " " + arr[n / 2]);
        }
    }
}