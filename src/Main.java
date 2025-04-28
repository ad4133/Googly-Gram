import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Giggle[] feed = new Giggle[] {
            new Giggle("Aster", "The sub is an opp", "The sub got the ears of a hawk", "Substitute teacher yelping and screaming at a kid for whistling", "Apr 28, 2025", 10002, 1029, 79.25, 97.5), 
            new Giggle("Johanna Johnson", "New Slang Drop", "Gotta add new common words to the mainstream", "Aster: Someone who is genius but no life \n Example: Gurt is being so Aster \n Gurt: Sybau", "Apr 19, 2025", 90111, 1101, 81.5, 99.9), 
            new Giggle("Brainrot.edu", "Update on the new slang drops", "New slang for the new people, super niche", "TS DICTIONARY: \n Kevin: Bad \n Owen: good \n James: Mid \n A'Rayyan: Rich but also kind of autistic \n gurt: Yo \n Yo: What \n What: Sybau", "Jan 1, 1999", 77112, 300133, 94.25, 97.5)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to GooglyGram! What is your username? ");
        String userName = scanner.nextLine();
        int choice = 0;
        boolean valid = false;
        while (true) {
            System.out.println("Hello, " + userName + ", what would you like to view? \n 1: Scroll a Giggle \n 2: View a post \n 3: View a friend's story ");
            while (!valid) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    valid = true;
                } 
                else {
                    System.out.print("Invalid input. Please enter an integer: ");
                    scanner.next();
                }
            }
            if (choice == 1) {
                int index = (int) (Math.random() * feed.length);
                System.out.println(feed[index]);
                System.out.println("That was a good Giggle!");
            }
            else if (choice == 2) {
                System.out.println("sybau");
            }
            else if (choice == 3) {
                System.out.println("sybau");
            }
            else {
                System.out.println("Sorry, that isn't a valid option.");
            }
            valid = false;
        }
    }
}