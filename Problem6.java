
public class Problem6 {
	
	public static void main(String[] args) {
		int sumTotal = 0;
		for(int i = 1; i <= 100; i++) {
			sumTotal += i*i;
		}
		int powerOfSum = 0;
		for(int i = 1; i <=100; i++) {
			powerOfSum += i;
		}
		powerOfSum = (int) Math.pow(powerOfSum, 2);
		
		System.out.println("1: " + sumTotal + ", 2: " + powerOfSum + ", 3: "
				+ (powerOfSum - sumTotal));
		
	}

}
