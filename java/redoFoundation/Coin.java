package redoFoundation;

public class Coin {

	public static void main(String[] args) {
		int n = 5;
		int a = 0;
		int b=1;
		int temp;
		
		for (int i = 0; i <=n; i++) {
			
			temp = a;
			a =a+b;
			b = temp;
		}
		System.out.println(a);
	}

}
