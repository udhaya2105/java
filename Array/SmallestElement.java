
public class SmallestElement {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int Smallest=a[0];
		for(int ele:a)
		{
			if(ele<Smallest) {
				Smallest=ele;
			}
		}
		System.out.println(Smallest);
	}
	}


