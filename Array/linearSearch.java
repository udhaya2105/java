
public class linearSearch {
public static void main(String[] args) {
	int a[]= {10,45,16,29,36,57};
	int key=16;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]==key) {
			System.out.println("Element found at" +i+ "index");
			return;
		}
	}
	System.out.println("Element not found");
}
}
