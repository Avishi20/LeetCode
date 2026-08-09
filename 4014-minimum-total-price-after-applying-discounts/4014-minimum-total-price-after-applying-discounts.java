class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double sum = 0;
        int n = discounts.length;
        int m = prices.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int priceIdx = m - 1;
        int discountIdx = n - 1;

        while (priceIdx >= 0) {
            if (discountIdx >= 0) {
                int p = prices[priceIdx];
                int d = discounts[discountIdx];
                sum += p * (100.0 - d) / 100.0;
                discountIdx--;
            } else {
                sum += prices[priceIdx];
            }
            priceIdx--;
        }
        return sum;
    }
}