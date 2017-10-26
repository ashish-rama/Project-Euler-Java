import java.math.BigInteger;

public class Problem20 {
	
	public static void main(String[] args) {
		BigInteger num = BigInteger.ONE;
		int total = 0;
		for(int i = 100; i > 0; i--) {
			num = num.multiply(BigInteger.valueOf(i));
		}
		String snum = "" + num;
		for(int i = 0; i < snum.length(); i++) {
			total += Integer.parseInt("" + snum.charAt(i));
		}
		System.out.println(total);
	}

}
