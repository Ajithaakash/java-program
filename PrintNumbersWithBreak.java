public class PrintNumbersWithBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            // Break the loop when i is equal to 4
            if (i == 4) {
                break;
            }
        }
    }
}