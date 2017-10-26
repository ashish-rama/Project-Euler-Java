
public class Problem5 {
	
	public static void main(String[] args) {
		int smallestNum = 0;
		int i = 10;
		while(smallestNum == 0) {
			System.out.println(i);
			boolean allDiv = true;
			for(int j = 1; j <= 20; j++) {
				if(i % j != 0) {
					allDiv = false;
					break;
				}
			}
			if(allDiv) {
				smallestNum = i;
			} else {
				i++;
			}
		}
	}

}
