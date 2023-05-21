import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Binary number: ");
        int num = input.nextInt();

        int base = 1;
        int dec_value = 0;

        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;

            dec_value += last_digit * base;
            base *= 2;
        }

        System.out.println("Given value in binary is " + dec_value);

    }
}