import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Giggle[] feed = new Giggle[] {
            new Giggle("Aster", "The sub is an opp", "The sub got the ears of a hawk", "Substitute teacher yelping and screaming at a kid for whistling", "Apr 28, 2025", 10002, 1029, 79.25, 97.5, new String[] {"Gurt: yo"}), 
            new Giggle("Johanna Johnson", "New Slang Drop", "Gotta add new common words to the mainstream", "Aster: Someone who is genius but no life \n Example: Gurt is being so Aster \n Gurt: Sybau", "Apr 19, 2025", 90111, 1101, 81.5, 99.9, new String[] {"C'mon man!"}), 
            new Giggle("Brainrot.edu", "Update on the new slang drops", "New slang for the new people, super niche", "TS DICTIONARY: \n Kevin: Bad \n Owen: good \n James: Mid \n A'Rayyan: Rich but also kind of autistic \n gurt: Yo \n Yo: What \n What: Sybau", "Jan 1, 1999", 77112, 20072, 94.25, 97.5, new String[] {"Ts lwk mainstream"})
        };

        Post[] posts = new Post[] {
            new Post("Ninja", "Lowww Taperrr Fadeee", "The low taper fade meme is so massive", "Ninja dragging the low taper fade meme", "February 25th, 2025", 3921, 9, new String[] {"Hello Gurt!", "gng was it worht the 9 likes"}),
            new Post("musicguy219", "Timeless Remix", "The timeless remix with Doechii is so buns gng", "The cover of the new Timeless Remix with an X crossing over it", "May 9th, 2025", 40721, 39492, new String[] {"ong it's bad", "timeless got the anxiety treatment 😭"}),
            new Post("Italian.BrainRot.Hub", "Tralalero Tralala vs Bombardiro Crocodillo", "The epic showdown between these two ancient foes", "Crocodile plane bombing a shark with shoes", "March 15th, 2025", 19283, 792, new String[] {"Ts in the big March of 2025😭", "ancient ahh meme gng"})

        };
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to GooglyGram! What is your username? ");
        String username = scanner.nextLine();
        Story[] stories = new Story[] {
            new  Story("A'Rayyan", "I love " + username, username + " is my favorite human being!", "A'Rayyan and you, embracing", "May 9th, 2025", 71, 10, 99.0, new String[] {"Nice!", "Good for you, A'Rayyan!"}),
            new  Story("Joey", "I really like " + username, username + " is my goat!!!", "Joey and you, embracing", "May 4th, 2025", 18, 13, 91.0, new String[] {"Thats great!!", "Thats amazing man great job!"}),
            new  Story("BrainRot.Memes", "I love " + username, username + " is so funny!", "Ts made me giggle so much.", "June 9th, 2025", 9000, 1700, 89.0, new String[] {"Ts is so Kevin!", "Brainrot in the big 25 💔"})

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