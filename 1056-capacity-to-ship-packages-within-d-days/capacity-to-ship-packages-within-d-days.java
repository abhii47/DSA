class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight); // ship must carry at least the heaviest item
            high += weight;              // total weight = max possible capacity
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, mid, days)) {
                high = mid; // try smaller capacity
            } else {
                low = mid + 1; // need more capacity
            }
        }

        return low; // or high, both are equal here
    }

    private boolean canShip(int[] weights, int capacity, int days) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                dayCount++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return dayCount <= days;
    }
}
