// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        int a =0,b = 1,c=0;
        if(n==0) {
        return a;
      
        }
        else if(n==1) {
        return b;
      
        }
        else {
            
            return nthFibonacci(n-1) + nthFibonacci(n-2);
        }
    }
}