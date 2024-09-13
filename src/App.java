import java.util.Scanner;

public class App {

    // Initialize scanner & variables
    Scanner madlibs = new Scanner(System.in);
    int choice;

    // initialize color variables

    // 13-16 learned from https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    // and https://codehs.com/tutorial/ryan/add-color-with-ansi-in-javascript
    String g = "\u001B[32m";
    String r = "\u001B[31m";
    String b = "\u001B[34m";
    String w = "\u001B[37m";
    
    // runs the main program calling on other methods
    public void start() {
        // main method
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        String playAgain;

        // 27 - 31 learned from https://www.w3schools.com/java/java_while_loop_do.asp
        do {
            doMadlib(userName);
            System.out.print(g+"Would you like to play again? [Y] / [N]\n"+w+" ↳ ");
            playAgain = madlibs.nextLine().toUpperCase();
        } while (playAgain.equals("Y")); // while loop to keep playing

        printGoodbye();
        madlibs.close();
    }
    
    // responsible for assigning a string value to userName
    public String getUserName() {
        // same thing with this one (https://www.asciiart.eu/text-to-ascii-art)
        System.out.println(b + "__        __   _                          _ ");
        System.out.println(b + "\\ \\      / /__| | ___ ___  _ __ ___   ___| |");
        System.out.println(b + " \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ |");
        System.out.println(b + "  \\ V  V /  __/ | (_| (_) | | | | | |  __/_|");
        System.out.println(b + "   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___(_)");
        System.out.print(g + "What is your name?\n"+w+" ↳ ");
        String userName = madlibs.nextLine();
        return (userName);
    }

    // prints out the initial instructions for using the madlibs
    public void printInstructions() { 
        System.out.println("Welcome to your own personal madlibs creation.");
        System.out.println("In order for us to create your story, you have to answer a few simple questions.");
        System.out.println("These are not personal questions, and feel free to be as creative as possible, so long as the needs we ask for are met.");
        System.out.println("A question might prompt you to give a 'Noun' or 'Verb ending in ing', in which case you would type in your answer and press 'ENTER'.");
        System.out.println("Please do not include any extra spaces or characters.");
        System.out.println("Have fun, and feel free to repeat as many times as you want!");
        System.out.println(r + "==================");
    }

    // prints out personalized greeting with userName as a parameter
    public void printGreeting(String userName) {
        System.out.println(r + "=================");
        System.out.println(g + "Hello " + userName + "!");
    }
    
    // doMadLib() is responsible for fetching all user inputs in relation to the madlib and for printing out the complete madlib
    public void doMadlib(String userName){

        System.out.print(g + "Which story would you like to follow?:\n" + b + "[1] --- [2] --- [3]\n" + w);
        choice = madlibs.nextInt();

        madlibs.nextLine(); 
        // prevent bugging from using .nextInt() previously 
        // learned from https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

        // story 1
        if (choice == 1) {
            // collect inputs
            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj1 = getValidInput();
            
            System.out.print(g+"Animal:\n"+w+" ↳ ");
            String animal1 = getValidInput();

            System.out.print(g+"Verb ending in ing:\n"+w+" ↳ ");
            String verb_ing1 = getValidInput();

            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun1 = getValidInput();

            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj2 = getValidInput();

            System.out.print(g+"Verb:\n"+w+" ↳ ");
            String verb1 = getValidInput();

            System.out.print(g+"Past tense verb:\n"+w+" ↳ ");
            String ptverb1 = getValidInput();

            System.out.print(g+"Place:\n"+w+" ↳ ");
            String place = getValidInput();

            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj3 = getValidInput();

            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun2 = getValidInput();

            System.out.print(g+"Emotion:\n"+w+" ↳ ");
            String emotion1 = getValidInput();

            // print out madlibs
            System.out.println(b+"Today, I, " + userName + ", went to the zoo and saw a very " + adj1 + " " + animal1 + ".");
            System.out.println("It was " + verb_ing1 + " near the " + noun1 + " and looked really " + adj2 + ".");
            System.out.println("I decided to " + verb1 + " closer, but then it " + ptverb1 + " towards (the) " + place + ".");
            System.out.println("It was so " + adj3 + "! After that, I bought a " + noun2 + " and left feeling " + emotion1);
            System.out.println(r+"==============");
        } else if (choice == 2) { // story 2
            // collect inputs
            System.out.print(g+ "Adjective:\n"+w+" ↳ ");
            String adj1 = getValidInput();

            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun1 = getValidInput();
            
            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj2 = getValidInput();

            System.out.print(g+"Verb:\n"+w+" ↳ ");
            String verb1 = getValidInput();

            System.out.print(g+"Animal:\n"+w+" ↳ ");
            String animal1 = getValidInput();

            System.out.print(g+"Verb:\n"+w+" ↳ ");
            String verb2 = getValidInput();

            System.out.print(g+"Verb:\n"+w+" ↳ ");
            String verb3 = getValidInput();

            System.out.print(g+"Place:\n"+w+" ↳ ");
            String place1 = getValidInput();

            System.out.print(g+"Verb:\n"+w+" ↳ ");
            String verb4 = getValidInput();

            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun2 = getValidInput();

            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj3 = getValidInput();

            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun3 = getValidInput();
            
            // print out madlibs
            System.out.println("In a small, " + adj1 + " " + noun1 + " shop, I found a " + adj2 + " potion on a shelf.");
            System.out.println("The label said it could make you " + verb1 + " like a " + animal1 + ". I decided to " + verb2 + " it.");
            System.out.println("Immediately, I started to " + verb3 + " all over (the) " + place1 + ", and suddenly, I could " + verb4 + ".");
            System.out.println("I kept going until I accidentally knocked over a " + noun2 + ".");
            System.out.println("I'll never forget that " + adj3 + " day. The day I became (a/an)" + noun3 + ".");
            System.out.println(r+"==============");
        } else if (choice == 3) { // story 3
            // collect inputs
            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj1 = getValidInput();

            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj2 = getValidInput();
            
            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj3 = getValidInput();
            
            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun1 = getValidInput();
            
            System.out.print(g+"Sound:\n"+w+" ↳ ");
            String sound1 = getValidInput();
            
            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun2 = getValidInput();
            
            System.out.print(g+"Noun:\n"+w+" ↳ ");
            String noun3 = getValidInput();
            
            System.out.print(g+"Verb:\n"+w+" ↳ ");
            String verb1 = getValidInput();
            
            System.out.print(g+"Past tense verb:\n"+w+" ↳ ");
            String ptverb1 = getValidInput();
            
            System.out.print(g+"Adjective:\n"+w+" ↳ ");
            String adj4 = getValidInput();
            
            // print out madlibs
            System.out.println("One " + adj1 + " night, my friends and I decided to explore the " + adj2 + " house at the end of the street.");
            System.out.println("We heard that it was haunted by a " + adj3 + " " + noun1 + ".");
            System.out.println("As we went inside, we heard a loud " + sound1 + ".");
            System.out.println("Then, a " + noun2 + " came flying towards us.");
            System.out.println("We ran upstairs and hid behind a " + noun3 + ", but the " + noun2 + " followed us.");
            System.out.println("We decided to " + verb1 + " to try to stop it, but it just " + ptverb1 + ".");
            System.out.println("It was so " + adj4 + ".");
            System.out.println(r+"==============");
        }
    }

    // I didn't want to keep writing "madlibs.nextLine.trim().toLowerCase();" so I made a function to take in user input, format, and make sure it's not empty
    public String getValidInput() {
        String input;
        do {
            input = madlibs.nextLine().trim().toLowerCase();
            if (input.isEmpty()) {
                System.out.print("Input cannot be empty, please try again:\n ↳ ");
            }
        } while (input.isEmpty());
        
        return input;
    }
  
    public void printGoodbye() {
        // Text itself was copied from https://www.asciiart.eu/text-to-ascii-art
        // and then I modified it to be able to be displayed "mostly just changing \ into \\"
        // idea gotten from talking to Gabu
        System.out.println(g+"Thanks for playing!");
        System.out.println(b+"  ____                 _ _                _ ");
        System.out.println(" / ___| ___   ___   __| | |__  _   _  ___| |");
        System.out.println("| |  _ / _ \\ / _ \\ / _` | '_ \\| | | |/ _ \\ |");
        System.out.println("| |_| | (_) | (_) | (_| | |_) | |_| |  __/_|");
        System.out.println(" \\____|\\___/ \\___/ \\__,_|_.__/ \\__, |\\___(_)");
        System.out.println("                               |___/       ");
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}