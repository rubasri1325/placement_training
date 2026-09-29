import java.util.Scanner;

class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        boolean found = false;

        System.out.println("Enter 4 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int n = sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                if (a[i][j] == n)
                    found = true;

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}