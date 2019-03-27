import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello please type in your name:");
        String name = input.nextLine();
        System.out.println("Your name is " + name);

        if (name == "natalie") {
            System.out.println("Your cool");
        } else {
            System.out.println("you drool");
        }
    }
}
