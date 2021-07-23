import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade : ");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Amazing!");
                break;
            case 'C':
                System.out.println("Well Done!");
                break;
            case 'D':
                System.out.println("You can do better next time.");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
