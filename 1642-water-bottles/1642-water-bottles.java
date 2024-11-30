class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkBottles =numBottles;
        while (numBottles >= numExchange) {
          int  newBottles = numBottles / numExchange;
           int remBottles = numBottles % numExchange;
            drinkBottles = drinkBottles + newBottles;
            numBottles = newBottles+remBottles;
        }
        return drinkBottles;

    }
}