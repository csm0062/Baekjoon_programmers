import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= num; i++) {
			sb.append("*".repeat(i)).append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}	
}
