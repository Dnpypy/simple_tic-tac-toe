import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int a = 1;
        final int b = 2;
        final int c = 3;
        final int d = 4;
        switch (n) {
            case a:
                System.out.println("Yes!");
                break;
            case b:
            case c:
            case d:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}