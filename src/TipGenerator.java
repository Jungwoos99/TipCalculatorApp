import java.text.NumberFormat;

public class TipGenerator {
    
    public static NumberFormat currency = NumberFormat.getCurrencyInstance();

    double[] basePercents = new double[] {.05, .10, .15};

    public void basePercentageTips(double totalBill) {
        for(double percent : basePercents) {
            System.out.println(((int)(percent * 100)) + "% tip: " + (currency.format(totalBill * percent)));
            System.out.println(" ");
        }
    }
}
