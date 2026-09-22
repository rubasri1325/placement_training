import java.util.*;

class MoveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];

                for (int j = i; j > 0; j--)
                    arr[j] = arr[j - 1];

                arr[0] = temp;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}