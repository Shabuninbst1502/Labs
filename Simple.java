import java.util.Scanner;

public class Simple {

	public Simple() {
		
	}

	public void startSearchSimple() {
		System.out.println();
		System.out.println("Введите число");
		int n = enterTheNumber();
		for (int i = 2; i <= n; i++) {
			if (isSimple(i)) {
				System.out.println(n);
			}
		}
	}

	private boolean isSimple(int n) {
		int i = 0;
		for(int k = 2; k < n; k++) {
			if(n % k == 0) {
				return false;
			} 
		} 
		return true;
	}

	private int enterTheNumber() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}