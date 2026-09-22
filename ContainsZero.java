import java.util.Scanner;

class ContainsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean found = false;

        while (n > 0) {
            if (n % 10 == 0) {
                found = true;
                break;
            }

            n /= 10;
        }

        if (found)
            System.out.println("Contains 0");
        else
            System.out.println("Does not contain 0");
    }
}