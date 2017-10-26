
public class Problem21 {
	
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i < 10000; i++) {
			if(isAmicable(i))
				total += i;
		}
		System.out.println(total);
	}
	
	private static boolean isAmicable(int num) {
		int potential = sumDivisors(num);
		return num != potential && sumDivisors(potential) == num;
	}

	private static int sumDivisors(int num) {
		int total = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0)
				total += i;
		}
		return total;
	}

}
