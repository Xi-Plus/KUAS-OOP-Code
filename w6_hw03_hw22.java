public class w6_hw03_hw22 {
	public static void main(String[] args) {
		int res[] = new int[6];

		res[0] = (int)(Math.random()*49+1);
		for (int q=1; q<6; q++) {
			while (true) {
				boolean dup = false;
				int x = (int)(Math.random()*49+1);
				for (int w=0; w<q; w++) {
					if (x == res[w]) {
						dup = true;
						break;
					}
				}
				if (!dup) {
					res[q] = x;
					break;
				}
			}
		}

		int t;
		for (int q=0; q<5; q++) {
			for (int w=0; w<5; w++) {
				if (res[w] > res[w+1]) {
					t = res[w];
					res[w] = res[w+1];
					res[w+1] = t;
				}
			}
		}

		System.out.print("樂透號碼為："+res[0]);
		for (int q=1; q<6; q++) {
			System.out.print("、"+res[q]);
		}
		System.out.println();
	}
}
