package wipro;

import java.util.*;

public class Arrays7 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};  // test with more inputs
		Arrays.sort(arr);
		int n = arr.length;
		
		List<Integer> list = new ArrayList<>();
		
		if (n > 0) {
			list.add(arr[0]);  // Always add the first element
		}
		
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				list.add(arr[i]);
			}
		}
		
		// Print unique sorted elements
		for (int num : list)
			System.out.print(num + " ");
	}
}
