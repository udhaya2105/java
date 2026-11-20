
public class ProductOfOddelementInOddindex {
	public static void main(String[] args) {
		int[]a= {10,11,12,13,14};
		int product=1;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==1&&i%2==1) {
				product=product*a[i];
			}
		}
		System.out.println(product);
	}
}
