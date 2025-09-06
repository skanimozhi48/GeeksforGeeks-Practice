class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        for(int num : arr) {
            if(!seen.add(num)) {
            
                    dup.add(num);
                }
            
        }
        return new ArrayList<>(dup);
    }
}