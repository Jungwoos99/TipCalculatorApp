import java.text.NumberFormat;
import java.util.Scanner;

public class CustomTipGenerator extends TipGenerator{
    Scanner read = new Scanner(System.in);

    private String choice;
    private double customTipPercent;
    private double totalBill;

    public CustomTipGenerator(String choice, double totalBill) {
        this.choice = choice;
        this.totalBill = totalBill;
    }

    public void customTip() {
        if(choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("y")){
            System.out.println("Please enter a custom tip amount. i.e. 20 for 20%");
            this.customTipPercent = read.nextDouble();
            double customPercentage = customTipPercent * .01;
            System.out.println( (int)customTipPercent + "% tip: " + (super.currency.format(customPercentage * totalBill)));
            System.out.println();
            System.out.println("Thank you!");

        } else if(choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("n")) {
            System.out.println("Thank you!");
        }
    }
}
