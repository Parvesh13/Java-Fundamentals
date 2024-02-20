import java.util.Scanner;

public class positiveOrnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("The Number is a Positive Number.\n");
        } else if (a < 0) {
            System.out.println("The Number is a Negative Number.\n");
        } else if (a == 0) {
            System.out.println("The Number is Zero.\n");
        } else {
            System.out.println("Wrong Input.\n");
        }
    }
}
