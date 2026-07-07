class Solution {
    public long sumAndMultiply(int n) {
        if (n < 10) return (long) n * n;

        long sum = 0;
        long ans = 0;
        int m = n;
        ArrayList<Integer> digits = new ArrayList<>();
        while (m > 0) {
            int digit = m % 10;
            sum += digit;
            digits.add(digit);
            m /= 10;
        }
        for (int i = digits.size() - 1; i >= 0; i--) {
            int d = digits.get(i);
            if (d != 0) {
                ans = ans * 10 + d;
            }
        }

        return ans * sum;
    }
}