import java.util.Scanner;

public class TipCalculatorApp {
    public static void main(String[] args) throws InvalidBillException {
        Scanner read = new Scanner(System.in);
        double totalBill = 0;
        String bill = new String();

        System.out.println("Welcome to Tip Calculator!");
        System.out.println();
        System.out.println("Please enter the total bill amount: ");

        try {
            bill = read.nextLine().replaceAll("\\$", "");
            double billDouble = Double.parseDouble(bill);
            totalBill = Math.abs(billDouble);
        } catch (Exception e) {
            System.out.println("Please enter a bill amount in numeric format.");
        }

        if(totalBill == 0) {
            System.out.println("Please enter a valid bill amount.");
        } else {
            TipGenerator baseTips = new TipGenerator();
            baseTips.basePercentageTips(totalBill);

            System.out.println("Would you like to use a custom tip percentage? Y or Yes/ N or No");
            read.nextLine();
            String chooseToUseCustomTip = read.nextLine();

            CustomTipGenerator customTipGenerator = new CustomTipGenerator(chooseToUseCustomTip, totalBill);
            customTipGenerator.customTip();
        }
    }
}

