package pl.mazurmarcin.javastart.lecture7;

public class PalindromeArray {

	public static boolean isPalindrome(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {

			if (arr[i] != arr[arr.length - 1 - i])
				return false;

		}

		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 7 };

		System.out.println(isPalindrome(arr));

	}

}
