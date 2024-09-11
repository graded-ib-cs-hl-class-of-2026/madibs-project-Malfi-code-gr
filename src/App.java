import java.util.Scanner;

public class App {
    // Initialize scanner
    Scanner madlibs = new Scanner(System.in);
    
    // runs the main program calling on other methods
    public void start() {
        // main method
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib(userName);
        System.out.println("Madlibs over. Feel free to restart, if you want.");
        madlibs.close();
    }
    

    // prints out the initial instructions for using the madlibs
    public void printInstructions() {
        System.out.println("> Welcome to your own personal madlibs creation.");
        System.out.println("> In order for us to create your story, you have to answer a few simple questions.");
        System.out.println("> These are not personal questions, and feel free to be as creative as possible, so long as the needs we ask for are met.");
        System.out.println("> A question might prompt you to give a 'Noun' or 'Verb ending in ing', in which case you would type in your answer and press 'ENTER'.");
        System.out.println("> Have fun, and feel free to repeat as many times as you want!");
        System.out.println("==================");
    }
    
    // responsible for assigning a string value to userName
    public String getUserName() {
        System.out.print("What is your name?\n>>  ");
        String userName = (madlibs.nextLine());
        return (userName);
    }

    // prints out personalized greeting with userName as a parameter
    public void printGreeting(String userName) {
        System.out.println("=================");
        System.out.println("> Hello " + userName + "!");
    }
    
    // doMadLib() is responsible for fetching all user inputs in relation to the madlib and for printing out the complete madlib
    public void doMadlib(String userName){
        // collect inputs
        System.out.print("> Noun:\n>> ");
        String noun1 = (madlibs.nextLine());

        System.out.print("> Verb:\n>> ");
        String verb1 = (madlibs.nextLine());

        System.out.print("> Verb ending in ing:\n>> ");
        String verb_ing1 = (madlibs.nextLine());

        System.out.print("> Place:\n>> ");
        String place1 = (madlibs.nextLine());

        System.out.print("> Adjective:\n>> ");
        String adjective1 = (madlibs.nextLine());

        System.out.print("> Food:\n>> ");
        String food1 = (madlibs.nextLine());

        System.out.print("> Body Part:\n>> ");
        String bp1 = (madlibs.nextLine());

        // print out madlibs
        System.out.println("I, " + userName + ", ate a " + noun1);
    }
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
