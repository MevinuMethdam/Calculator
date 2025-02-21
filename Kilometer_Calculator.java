import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter the Number of Miles: ");
        int miles = scanner.nextInt();

        System.out.println("Enter the Number of Yards: ");
        int yards = scanner.nextInt();

        double kilometers = ((miles*1.609)+(1/1760)*1.609);
        System.out.println("Kilometers: "+kilometers);



        scanner.close();
    }
}