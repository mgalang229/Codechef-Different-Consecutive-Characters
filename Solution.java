import java.util.Scanner;

/*

10100
ans: 1

00010
ans: 2

note: insert (operation)

 */

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			char[] s = fs.next().toCharArray();
			int counter = 0;
			for (int i = 0; i < n - 1; i++) {
				if (s[i] == s[i+1]) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		fs.close();
	}
}
