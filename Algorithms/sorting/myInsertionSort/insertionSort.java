public class insertionSort {

	public static void main(String[] args) {
		int a[] = new int[]{1, 56, 4, 78, 100, 2, 5};
		myInsertionSort(a);
		print(a);		
	}

	public static void myInsertionSort(int[] a) {
		int n = a.length;

		for (int i = 1; i < n; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
	}

	public static void print(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
