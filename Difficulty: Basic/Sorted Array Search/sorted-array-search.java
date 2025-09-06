class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        boolean fag= false;
        for(int num:arr) {
            if(num == k) {
                fag = true;
            }
        }
        return fag;
    }
}