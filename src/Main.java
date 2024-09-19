import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double price = 25.0;
        double taxRate = .05;
        double salesTax = taxRate *price;
        double totalPrice = price +salesTax;

        System.out.println("The sales tax is $" + salesTax);
        System.out.println("The total price is $" + totalPrice);







    }
}