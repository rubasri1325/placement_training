import java.util.Scanner;

class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int square = n * n;

        if (square % 10 == n % 10)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}