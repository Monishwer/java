package Assignments;

public class alternateprimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, count = 0, k = 0;
		for(i = 1; i< 20; i++) {
			for(j = 1; j<= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				if(k % 2 == 0) {
					System.out.println(i * i);
				}
				k++;
			}
			count = 0;
		}

	}

}
