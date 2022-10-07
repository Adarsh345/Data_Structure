package ArrayProblemLecture2;

public class LeaderInAnArray {
	public static void main(String[] args) {
		int [] arr = {2,7,6,1,4,3};
		for(int i = 0 ; i<arr.length; i++) {
			int curr = arr[i];
			boolean isLeader = true; 
			for(int j = i+1; j<arr.length; j++) {
				if(curr<arr[j]) {
				   isLeader = false;
				}
			}
			if(isLeader) {
				System.out.println(curr);
			}
		}
	}
}
