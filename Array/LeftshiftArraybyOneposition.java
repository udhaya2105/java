
public class LeftshiftArraybyOneposition {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	for(int i=0;i<=a.length-2;i++) {
		a[i]=a[i+1];
	}
	a[a.length-1]=0;
	System.out.println(a);
}
}
