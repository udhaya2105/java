public class EvenElementInOddIndex {
	public static void main(String[] args) {
		int[]a= {10,11,12,13,14};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0&&i%2==1) {
				System.out.println(a[i]);
			}
		}
	}
}
