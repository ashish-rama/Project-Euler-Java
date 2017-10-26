import java.util.ArrayList;

public class Problem10 {

	static ArrayList<Long> primes = new ArrayList<Long>();

	public static void main(String[] args) {
		long total = 2;
		for(long i = 3; i < 2000000; i += 2) {
			if(isPrime(i)) {
				System.out.println(i);
				total += i;
			}
		}
		System.out.println(total);
	}

	public static boolean isPrime(long num) {
		for(long val : primes) {
			if(val * val > num)
				break;
			if(num % val == 0)
				return false;
		}
		primes.add(num);
		return true;
	}

}
