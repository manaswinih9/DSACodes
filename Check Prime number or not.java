class Solution {
    static boolean isPrime(int n) {
        int cnt=0;
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==0){
            return true;
        }
        return false;
    }
}
