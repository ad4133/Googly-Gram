import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Giggle[] feed = new Giggle[] {
            new Giggle("Aster", "The sub is an opp", "The sub got the ears of a hawk", "Substitute teacher yelping and screaming at a kid for whistling", "Apr 28, 2025", 10002, 1029, 79.25, 97.5, new String[] {"Gurt: yo"}), 
            new Giggle("Johanna Johnson", "New Slang Drop", "Gotta add new common words to the mainstream", "Aster: Someone who is genius but no life \n Example: Gurt is being so Aster \n Gurt: Sybau", "Apr 19, 2025", 90111, 1101, 81.5, 99.9, new String[] {"C'mon man!"}), 
            new Giggle("Brainrot.edu", "Update on the new slang drops", "New slang for the new people, super niche", "TS DICTIONARY: \n Kevin: Bad \n Owen: good \n James: Mid \n A'Rayyan: Rich but also kind of autistic \n gurt: Yo \n Yo: What \n What: Sybau", "Jan 1, 1999", 77112, 20072, 94.25, 97.5, new String[] {"Ts lwk mainstream"})
        };

        Post[] posts = new Post[] {
            new Post("s", "d", "f", "t", "e", 2102, 9, new String[] {"Hello Gurt!", "gng was it worht the 9 likes"})
        };
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to GooglyGram! What is your username? ");
        String username = scanner.nextLine();
        Story[] stories = new Story[] {
            new  Story("A'Rayyan", "I love " + username, username + " is my favorite human being!", "A'Rayyan and you, embracing", "May 9th, 2025", 9, 10, 99.0, new String[] {"Nice!", "Good for you, A'Rayyan!"})
        };
        int choice = 0;
        while (true) {
            System.out.println("Hello, " + username + ", what would you like to view? \n 1: Scroll a Giggle \n 2: View a post \n 3: View a friend's story \n 4: Exit the app");
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        break;
                    }
                    else {
                        System.out.print("Invalid input. Please enter an integer between 1-4: ");
                    }
                }
                else {
                    System.out.print("Invalid input. Please enter an integer between 1-4: ");
                    scanner.next();
                }
            }
            if (choice == 1) {
                int index = (int) (Math.random() * feed.length);
                System.out.println(feed[index]);
                System.out.println("That was a good Giggle! What do you want to do? \n 1: Like this Giggle \n 2: Laugh at this Giggle \n 3: View comments");
                while (true) {
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice >= 1 && choice <= 3) break;
                        else System.out.print("Invalid input. Please enter an integer between 1-3: ");
                    } 
                    else {
                        System.out.print("Invalid input. Please enter an integer between 1-3: ");
                        scanner.next();
                    }
                }
                if (choice == 1) {
                    System.out.println("You liked this Giggle!");
                    feed[index].like();
                }
                else if (choice == 2) {
                    System.out.println("You laughed at this Giggle!");
                    feed[index].laugh();
                }
                else {
                    System.out.println(feed[index].commentsToString()); 
                }
            }
            else if (choice == 2) {
                int index = (int) (Math.random() * posts.length);
                System.out.println(posts[index]);
                System.out.println("That was a good Post! What do you want to do? \n 1: Like this Post \n 2: View comments");
                while (true) {
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice >= 1 && choice <= 2) break;
                        else System.out.print("Invalid input. Please enter an integer between 1-2: ");
                    } 
                    else {
                        System.out.print("Invalid input. Please enter an integer between 1-2: ");
                        scanner.next();
                    }
                }
                if (choice == 1) {
                    System.out.println("You liked this Post!");
                    posts[index].like();
                }
                else if (choice == 2) {
                    System.out.println(posts[index].commentsToString()); 
                }
            }
            else if (choice == 3) {
                int index = (int) (Math.random() * stories.length);
                System.out.println(stories[index]);
                System.out.println("That was a good Story! What do you want to do? \n 1: Like this Story \n 2: React to this Story \n 3: View comments");
                while (true) {
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice >= 1 && choice <= 3) break;
                        else System.out.print("Invalid input. Please enter an integer between 1-3: ");
                    }
                    else {
                        System.out.print("Invalid input. Please enter an integer between 1-3: ");
                        scanner.next();
                    }
                }
                if (choice == 1) {
                    System.out.println("You liked this story!");
                    stories[index].like();
                }
                else if (choice == 2) {
                    System.out.println(stories[index].react());
                }
                else {
                    System.out.println(stories[index].commentsToString()); 
                }
            }
            else {
                System.out.println("Thank you for using GooglyGram!");
                break;
            }
        }
    }
}