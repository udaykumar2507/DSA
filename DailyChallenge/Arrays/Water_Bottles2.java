class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int bottle_drunk = 0;
        int max = 0;
        while ( emptyBottles < numExchange && numBottles > 0){
            emptyBottles += numBottles;
            bottle_drunk += numBottles;
            max = Math.max(bottle_drunk,max);
            numBottles = 0;
            while (emptyBottles >= numExchange){
                numBottles += 1;
                emptyBottles -= numExchange;
                numExchange++;
            }
        }
        return max;  
    }
}
