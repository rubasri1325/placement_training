import java.util.Scanner;

class SecondaryDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Secondary Diagonal:");

        for (int i = 0; i < 3; i++)
            System.out.print(a[i][2 - i] + " ");
    }
}