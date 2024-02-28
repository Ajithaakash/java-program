public class MultiplyFirst100Numbers {
    public static void main(String[] args) {
        long product = 1;

        for (int i = 1; i <= 100; i++) {
            product *= i;
        }

        System.out.println("The product of the first 100 numbers is: " + product);
    }
}