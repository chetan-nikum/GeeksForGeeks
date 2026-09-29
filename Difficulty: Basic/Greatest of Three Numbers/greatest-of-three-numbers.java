import java.util.Scanner;

class GFG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// code here
		
		int result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(result);
	}
}
