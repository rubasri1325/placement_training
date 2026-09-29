import java.util.Scanner;

class PositiveNegative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("Enter 4 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] > 0)
                    positive++;
                else if (a[i][j] < 0)
                    negative++;
                else
                    zero++;
            }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}