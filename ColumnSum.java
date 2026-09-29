import java.util.Scanner;

class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];

        System.out.println("Enter 4 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        for (int j = 0; j < 2; j++) {
            int sum = 0;

            for (int i = 0; i < 2; i++)
                sum = sum + a[i][j];

            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }
    }
}