package ArrayProblemLecture2;

import java.util.Arrays;

public class SecoundLargestElementInAnArray {

	public static int secoundLargestElement(int[] arr) {
		int largest = 0;
		int secoundLargest = -1;

		if (arr.length < 2) {
			return -1;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				secoundLargest = largest;
				largest = i;
			} else if (arr[largest] > arr[i]) {

				/*secoundLargest == -1
				 * this condition is indicate that secoundLargest value has not change yet
				 * or it contains -1, to prevent arrayIndexOutOfBoundException 
				 * I have put this condition that will check if secoundLargest value has -1
				 * value condition will become true an update the value;
				*/
				
				if (secoundLargest == -1 || arr[i] > arr[secoundLargest]) {
					secoundLargest = i;
				}
			}
		}
		return arr[secoundLargest];
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 13, 21, 45, 60 ,59};
		System.out.println(secoundLargestElement(arr));
	}

}