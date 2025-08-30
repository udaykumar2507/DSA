class Solution {
    public long flowerGame(int n, int m) {
        long even1 = (n + 1) / 2;// number of even in 1 to n
        long odd1 = (m / 2); // number of odd in 1 to m
        long even2 = (n / 2);// number of even in 1 to n
        long odd2 = (m + 1) / 2;// number of odd in 1 to m
        long evenodd = even1 * odd1;// total possibilty of getting odd sum from evens count from m and odd counts
                                    // from n
        long oddeven = odd2 * even2;// total possibilty of getting odd sum from evens count from n and odd counts
                                    // from m
        return evenodd + oddeven;// sum of posibility
    }
}