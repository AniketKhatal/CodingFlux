
import java.util.Scanner;

public class EvenOddBitwise {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            if ((num & 1) == 1) {
                System.out.println("Given number is odd");
            }
            else{
                System.out.println("Number is Even");
            }
        }
    }
}
