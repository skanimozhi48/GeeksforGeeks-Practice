// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int num = n;
        int count=0;
        while(num>0) {
        int rem = num%10;
            num/=10;
            if(rem!=0 && n% rem==0)
            count++;
        }
        return count;
    }
}