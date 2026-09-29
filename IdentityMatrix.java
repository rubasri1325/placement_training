import java.util.Scanner;

class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        boolean identity = true;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && a[i][j] != 1)
                    identity = false;

                if (i != j && a[i][j] != 0)
                    identity = false;
            }
        }

        if (identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");
    }
}