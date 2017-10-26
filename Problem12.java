
public class Problem12 {
	
	public static void main(String[] args) {
		long val = 0;
		long i = 1;
		while(val == 0) {
			long triangle = 0;
			//calc triangle
			for(long j = 1; j <= i; j++) {
				triangle += j;
			}
			System.out.println("triangle: " + triangle);
			//count factors of triangle
			int count = 0;
			for(long j = 1; j*j <= triangle; j++) {
				if(triangle % j == 0)
					count+=2;
			}
			System.out.println("triangle factors count: " + count);
			if(count > 500) {
				System.out.println(triangle);
				return;
			}
			i++;
			count = 0;
		}
	}

}
