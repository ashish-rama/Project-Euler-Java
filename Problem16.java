import java.math.BigInteger;

public class Problem16 {
	
	public static void main(String[] args) {
		BigInteger val = BigInteger.valueOf(2).pow(1000);
		String num = val.toString();
		int total = 0;
		for(int i = 0; i < num.length(); i++) {
			total += Integer.parseInt("" + num.charAt(i));
		}
		System.out.println("val: " + val + "\ntotal: " + total);
	}

}
