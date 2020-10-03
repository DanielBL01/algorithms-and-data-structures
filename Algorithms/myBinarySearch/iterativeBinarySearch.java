import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class iterativeBinarySearch {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(2,5,8,10,15,23,56,100));
		int result = myBinarySearch(10, myList);
		
		System.out.println(result);
	}

	public static int myBinarySearch(int target, List<Integer> list) {
		int start = 0, end = list.size() - 1;

		while(start <= end) {
			int mid = (start + end) / 2;
			if (list.get(mid) < target) {
				start = mid + 1;
			} else if (list.get(mid) == target) {
				return mid;
			} else {
				end = mid - 1;
			}
		}
		
		return -1;
	}
}

