import java.util.Scanner;

public class App {
    // Initialize scanner & variables
    Scanner madlibs = new Scanner(System.in);
    int choice;
    
    // runs the main program calling on other methods
    public void start() {
        // main method
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        String playAgain;
        do {
            doMadlib(userName);
            System.out.print("Would you like to play again? [Y] / [N]\n>>  ");
            playAgain = madlibs.nextLine().toUpperCase();
        } while (playAgain.equals("Y")); // while loop to keep playing

        System.out.println("Thanks for playing!");
        madlibs.close();
    }
    
    // responsible for assigning a string value to userName
    public String getUserName() {
        System.out.println("__        __   _                          _ ");
        System.out.println("\\ \\      / /__| | ___ ___  _ __ ___   ___| |");
        System.out.println(" \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ |");
        System.out.println("  \\ V  V /  __/ | (_| (_) | | | | | |  __/_|");
        System.out.println("   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___(_)");
        System.out.print("What is your name?\n>>  ");
        String userName = (madlibs.nextLine());
        return (userName);
    }
    
    // prints out the initial instructions for using the madlibs
    public void printInstructions() {
        System.out.println("> Welcome to your own personal madlibs creation.");
        System.out.println("> In order for us to create your story, you have to answer a few simple questions.");
        System.out.println("> These are not personal questions, and feel free to be as creative as possible, so long as the needs we ask for are met.");
        System.out.println("> A question might prompt you to give a 'Noun' or 'Verb ending in ing', in which case you would type in your answer and press 'ENTER'.");
        System.out.println("Please do not include any extra spaces or characters.");
        System.out.println("> Have fun, and feel free to repeat as many times as you want!");
        System.out.println("==================");
    }

    // prints out personalized greeting with userName as a parameter
    public void printGreeting(String userName) {
        System.out.println("=================");
        System.out.println("> Hello " + userName + "!");
    }
    
    // doMadLib() is responsible for fetching all user inputs in relation to the madlib and for printing out the complete madlib
    public void doMadlib(String userName){

        System.out.print("Which story would you like to follow?:\n[1] --- [2] --- [3]\n");
        choice = madlibs.nextInt();

        madlibs.nextLine(); // prevent bugging from using .nextInt() before

        // story 1
        if (choice == 1) {
            // collect inputs
            System.out.print("> Adjective:\n>> ");
            String adj1 = (madlibs.nextLine());
            
            System.out.print("> Animal:\n>> ");
            String animal1 = (madlibs.nextLine());

            System.out.print("> Verb ending in ing:\n>> ");
            String verb_ing1 = (madlibs.nextLine());

            System.out.print("> Noun:\n>> ");
            String noun1 = (madlibs.nextLine());

            System.out.print("> Adjective:\n>> ");
            String adj2 = (madlibs.nextLine());

            System.out.print("> Verb:\n>> ");
            String verb1 = (madlibs.nextLine());

            System.out.print("> Past tense verb:\n>> ");
            String ptverb1 = (madlibs.nextLine());

            System.out.print("> Place:\n>> ");
            String place = (madlibs.nextLine());

            System.out.print("> Adjective:\n>> ");
            String adj3 = (madlibs.nextLine());

            System.out.print("> Noun:\n>> ");
            String noun2 = (madlibs.nextLine());

            System.out.print("> Emotion:\n>> ");
            String emotion1 = (madlibs.nextLine());

            // print out madlibs
            System.out.println("Today, I, " + userName + ", went to the zoo and saw a very " + adj1 + " " + animal1 + ".");
            System.out.println("It was " + verb_ing1 + " near the " + noun1 + " and looked really " + adj2 + ".");
            System.out.println("I decided to " + verb1 + " closer, but then it " + ptverb1 + " and ran towards the " + place + ".");
            System.out.println("It was so " + adj3 + "! After that, I bought a " + noun2 + " and left feeling " + emotion1);
            System.out.println("==============");
        } else if (choice == 2) { // story 2
            // collect inputs
            System.out.print("> Adjective:\n>> ");
            String adj1 = (madlibs.nextLine());

            System.out.print("> Noun:\n>> ");
            String noun1 = (madlibs.nextLine());
            
            System.out.print("> Adjective:\n>> ");
            String adj2 = (madlibs.nextLine());

            System.out.print("> Verb:\n>> ");
            String verb1 = (madlibs.nextLine());

            System.out.print("> Animal:\n>> ");
            String animal1 = (madlibs.nextLine());

            System.out.print("> Verb:\n>> ");
            String verb2 = (madlibs.nextLine());

            System.out.print("> Verb:\n>> ");
            String verb3 = (madlibs.nextLine());

            System.out.print("> Place:\n>> ");
            String place1 = (madlibs.nextLine());

            System.out.print("> Verb:\n>> ");
            String verb4 = (madlibs.nextLine());

            System.out.print("> Noun:\n>> ");
            String noun2 = (madlibs.nextLine());

            System.out.print("> Adjective:\n>> ");
            String adj3 = (madlibs.nextLine());

            System.out.print("> Noun:\n>> ");
            String noun3 = (madlibs.nextLine());
            
            // print out madlibs
            System.out.println("In a small, " + adj1 + " " + noun1 + " shop, I found a " + adj2 + " potion on a shelf.");
            System.out.println("The label said it could make you " + verb1 + " like a " + animal1 + ". I decided to " + verb2 + " it.");
            System.out.println("Immediately, I started to " + verb3 + " all over the " + place1 + ", and suddenly, I could " + verb4 + ".");
            System.out.println("I kept going until I accidentally knocked over a " + noun2 + ".");
            System.out.println("I'll never forget that " + adj3 + " day. The day I became " + noun3 + ".");
        } else if (choice == 3) { // story 3
            // collect inputs
            System.out.print("> Adjective:\n>> ");
            String adj1 = (madlibs.nextLine());

            System.out.print("> Adjective:\n>> ");
            String adj2 = (madlibs.nextLine());
            
            System.out.print("> Adjective:\n>> ");
            String adj3 = (madlibs.nextLine());
            
            System.out.print("> Noun:\n>> ");
            String noun1 = (madlibs.nextLine());
            
            System.out.print("> Sound:\n>> ");
            String sound1 = (madlibs.nextLine());
            
            System.out.print("> Noun:\n>> ");
            String noun2 = (madlibs.nextLine());
            
            System.out.print("> Noun:\n>> ");
            String noun3 = (madlibs.nextLine());
            
            System.out.print("> Verb:\n>> ");
            String verb1 = (madlibs.nextLine());
            
            System.out.print("> Past tense verb:\n>> ");
            String ptverb1 = (madlibs.nextLine());
            
            System.out.print("> Adjective:\n>> ");
            String adj4 = (madlibs.nextLine());
            
            // print out madlibs
            System.out.println("One " + adj1 + " night, my friends and I decided to explore the " + adj2 + " house at the end of the street.");
            System.out.println("We heard that it was haunted by a " + adj3 + " " + noun1 + ".");
            System.out.println("As we went inside, we heard a loud " + sound1 + ".");
            System.out.println("Then, a " + noun2 + " came flying towards us.");
            System.out.println("We ran upstairs and hid behind a " + noun3 + ", but the " + noun2 + " followed us.");
            System.out.println("We decided to " + verb1 + " to try to stop it, but it just " + ptverb1 + ".");
            System.out.println("It was so " + adj4 + ".");
        }
    }
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
