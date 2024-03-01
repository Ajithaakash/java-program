
import java.util.*;
import java.util.Scanner;
public class pattern {
	
	public static void printPattern(int n)
	{
  		int i, j;
		
		for (i = 1; i <= n; i++) {
			
			for (j = 1; j <= i; j++) {
				
				System.out.print(j + " ");
			}

			
			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		printPattern(n);
	}
}
