package Task02;

public class Main {

	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
