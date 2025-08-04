class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length < 2)
        return -1;
        int max =arr[0];
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++) {
            if(arr[i] > max) {
                largest = max;
                 max = arr[i];
                
            }
            else if(arr[i] > largest && arr[i] != max) {
                largest= arr[i];
            }
        }
        
        return (largest == Integer.MIN_VALUE? -1: largest);
    }
}