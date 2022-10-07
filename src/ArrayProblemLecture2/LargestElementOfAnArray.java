package ArrayProblemLecture2;

public class LargestElementOfAnArray {
	public int largestElementOfAnArray(int [] arr) {
		int max = 0; 
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>arr[max]) {
				max = i; 
			}
		}return arr[max];
	}
	public static void main(String[] args) {
     int [] arr = {10 , 20 , 40 , 30};
     LargestElementOfAnArray large = new LargestElementOfAnArray();
     System.out.println(large.largestElementOfAnArray(arr));
	}
}
