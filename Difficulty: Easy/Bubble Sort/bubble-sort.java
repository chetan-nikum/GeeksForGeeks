class Solution {
	public void bubbleSort(int[] arr) {
		
		for (int i = arr.length - 1; i >= 0; i--) {
			
			boolean swap = false;
			
			for (int j = 0; j<i; j++) {
				if (arr[j]>arr[j + 1]) {
					swap = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (swap == false)
				break;
		}
		
	}
}
