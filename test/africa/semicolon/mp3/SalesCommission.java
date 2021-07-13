package africa.semicolon.mp3;

public class SalesCommission {
    private  double weeklyPay;
    private  double grossSales;
    private  double commission;
    private  double earnings;

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

  public void salesCommission(double grossSales) {
        commission = (float)9/100 * grossSales;

    }

    public double getSalesCommission() {
        return commission;
    }

    public void setTotalEarnings(double weeklyPay,double grossSales,double commission) {
      earnings = weeklyPay + grossSales + commission;

    }

    public double getTotalEarnings() {
        return earnings;
    }

    public double getTotalSales(double item1, double item2, double item3, double item4) {
        grossSales = item1 + item2 + item3 + item4;
        return  grossSales;
    }
}
