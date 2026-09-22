import java.util.*;

class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        while (k < n) {
            arr[k] = 0;
            k++;
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}