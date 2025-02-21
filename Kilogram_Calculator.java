import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Pound: ");
        int pound = scanner.nextInt();

        System.out.println("Enter the Ounce: ");
        int ounce = scanner.nextInt();

        double kilogram = ((pound*0.453592)+(ounce*0.0283495));
        System.out.println("Kilograms: "+kilogram);

        scanner.close();
    }
}