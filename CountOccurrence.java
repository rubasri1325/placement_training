import java.util.Scanner;

class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == target)
                count++;

            n /= 10;
        }

        System.out.println(count);
    }
}
