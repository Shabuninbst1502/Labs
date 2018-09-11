import java.util.Scanner;

public class Palyndrom {

	public Palyndrom() {

	}

	public void startPalyndrom() {
		System.out.println();
		System.out.println("Введите слово");
		String str = getWord();
		System.out.println(isPalindrom(str));
	}

	public boolean isPalindrom(String str) {
		char[] array = str.toCharArray();
		int k = 0;
		for(int i = 0; i < str.length()/2; i++) {
			if(array[i] != array[str.length() - i - 1]) {
				return false;
			}
		}
		return true;
	}

	public String getWord() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}