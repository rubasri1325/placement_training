import java.util.Scanner;

class RowLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];

        System.out.println("Enter 4 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            int largest = a[i][0];

            for (int j = 1; j < 2; j++)
                if (a[i][j] > largest)
                    largest = a[i][j];

            System.out.println("Largest in Row " + (i + 1) + " = " + largest);
        }
    }
}