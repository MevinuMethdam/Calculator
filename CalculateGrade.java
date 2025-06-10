import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double percent = 0;
        double avg = 0;
        int sum =0;
        int i = 1;
        while(i<=5) {
            System.out.print("Enter the Mark: ");
            int mark = scanner.nextInt();

            if(mark>=75){
                System.out.println("A");
            }
            else if(mark>=60 && mark<=74){
                System.out.println("B");
            }
            else if(mark>=50 && mark<=59){
                System.out.println("c");
            }
            else if(mark>=35 && mark<=49){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
            sum+=mark;
            i++;
        }
        avg = sum/5.0;
        percent = (sum/500.0)*100;
        System.out.println("Total Marks: "+sum);
        System.out.println("Average Marks: "+avg);
        System.out.println("percentage: "+percent);

    }
}
