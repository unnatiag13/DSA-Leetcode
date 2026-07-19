class Solution {
    public int fib(int n) {
        int a =0, b =1;
        if(n<1) return a;
        for(int i=0;i<n-1;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
//       i a b
// c = 1 1 1 1
// c=  2 2 1 2
// c = 3 3 2 3
// c=  5 4 3 5


