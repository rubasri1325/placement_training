import java.util.Scanner;

class SmallestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int smallest = a;

        if (b < smallest)
            smallest = b;

        if (c < smallest)
            smallest = c;

        System.out.println(smallest);
    }
}
