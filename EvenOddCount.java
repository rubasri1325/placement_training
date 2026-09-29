
import java.util.Scanner;

class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int even = 0;
        int odd = 0;

        System.out.println("Enter 4 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}