
public class Problem14 {

	public static void main(String[] args) {
		long max = 0;
		int maxSteps = 0;
		for(int j = 2; j < 1000000; j++) {
			System.out.println("j: " + j);
			long i = j;
			int steps = 0;
			while(i != 1) {
				if(i % 2 == 0)
					i /= 2;
				else
					i = i*3 + 1;
				steps++;
			}
			if(steps > maxSteps) {
				System.out.println(steps);
				maxSteps = steps;
				max = j;
			}
		}
		System.out.println("max " + max + ", steps " + maxSteps);
	}

}
