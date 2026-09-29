import java.util.Scanner;

class BoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (i == 0 || i == 2 || j == 0 || j == 2)
                    sum = sum + a[i][j];

        System.out.println("Boundary Sum = " + sum);
    }
}