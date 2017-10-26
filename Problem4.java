
public class Problem4 {

	public static void main(String[] args) {
		int pallindrome = 0;
		for(int i = 100; i < 1000; i++) {
			for(int j = i + 1; j < 1000; j++) {
				if(isPalindrome(i * j) && (i*j) > pallindrome) {
					pallindrome = i * j;
				}
			}
		}
		System.out.println(pallindrome);
	}

	public static boolean isPalindrome(int num) {
		int pallindrome = num;
		String reversed = "";
		while(pallindrome > 0) {
			reversed += pallindrome % 10;
			pallindrome /= 10;
		}
		return Integer.parseInt(reversed) == num;
	}

}
