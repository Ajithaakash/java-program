import java.util.Scanner;

public class OddNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range of numbers: ");
        int n = scanner.nextInt();

        int oddCount = 0;

        System.out.println("Odd numbers in the range 1 to " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
            oddCount++;
        }

        System.out.println("Count of odd numbers: " + oddCount);

        scanner.close();
    }
}