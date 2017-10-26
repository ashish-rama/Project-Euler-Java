
public class Problem7 {

	public static void main(String[] args) {
		int count = 0;
		int i = 2;
		while(count != 10001) {
			if(isPrime(i)) {
				count++;
			}
			i++;
			if(count == 10001) {
				i--;
			}
		}
		System.out.println(i);
	}

	public static boolean isPrime(long num) {
		for(long i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
