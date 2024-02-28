public class First100OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        
        System.out.println("The first 100 odd numbers are:");
        for (int i = 1; count < 100; i += 2) {
            System.out.println(i);
            count++;
        }
    }
}