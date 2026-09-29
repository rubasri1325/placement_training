import java.util.Scanner;

class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];

        System.out.println("Enter 6 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Transpose:");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 2; i++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
    }
}