import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("What Fibonacci number would you like to go to?");
        System.out.println("(Note: Don't try a number above 40)");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
	public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
