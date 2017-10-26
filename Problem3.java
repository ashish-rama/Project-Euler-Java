
public class Problem3 {

	static final long NUM = 600851475143L;

	public static void main(String[] args) {
		long primeNum = 0;
		for(long i = 3; i < Math.sqrt(NUM); i += 2) {
			if(NUM % i == 0 && isPrime(i)) {
				primeNum = i;
			}
		}
		System.out.println(primeNum);
	}

	public static boolean isPrime(long num) {
		for(long i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
