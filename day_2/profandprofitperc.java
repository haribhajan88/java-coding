public class profandprofitperc {
    public static void main(String[] args) {
        int costPrice = 500;
        int sellingPrice = 700;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;
        System.out.println("Profit: " + profit);
        System.out.println("Profit Percentage: " + profitPercentage + "%");
    }
}
