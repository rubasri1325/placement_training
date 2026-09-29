import java.util.Scanner;

class ColumnLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];

        System.out.println("Enter 4 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        for (int j = 0; j < 2; j++) {
            int largest = a[0][j];

            for (int i = 1; i < 2; i++)
                if (a[i][j] > largest)
                    largest = a[i][j];

            System.out.println("Largest in Column " + (j + 1) + " = " + largest);
        }
    }
}