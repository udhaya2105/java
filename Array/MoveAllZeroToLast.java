import java.util.Arrays;

public class MoveAllZeroToLast {

	public static void main(String[] args) {
		int[]a= {10,0,12,13,0,14};
		int index=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=0) {
				a[index]=a[i];
				index++;
			}
		}
		while(index<a.length) {
			a[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(a));

	}

}
