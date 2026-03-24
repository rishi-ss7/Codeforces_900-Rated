import java.util.Scanner;

public class chemistry {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong(); 
		while (t-- > 0) {
			long n = scanner.nextLong(); 
			long k = scanner.nextLong(); 
			String s = scanner.next();

		
			int[] res = new int[26];
			for (int i = 0; i < n; i++) {
				res[s.charAt(i) - 'a']++; 
			}

			long oddFrequency = 0; 
			for (int i = 0; i < 26; i++) {
				oddFrequency += res[i] % 2;
			}

			
			if (oddFrequency > k + 1) {
				System.out.println("NO"); 
			} else {
				System.out.println("YES"); 
			}
		}
		scanner.close();
	}
}