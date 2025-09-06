class Solution {
    public int search(int arr[], int x) {
        // code here
        int index=0;
        for(int i =0;i<arr.length;i++) {
            if(arr[i] == x) {
                index = i;
                break;
            }
            else
            index =-1;
        }
        return index; 
    }
}
