package prepare.algorithms.implementation;

public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxPrice = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sumPrice = keyboards[i] + drives[j];
                if (sumPrice > maxPrice && sumPrice <= b) {
                    maxPrice = sumPrice;
                }
            }
        }
        return maxPrice;
    }
}
