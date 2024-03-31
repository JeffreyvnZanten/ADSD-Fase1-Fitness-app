package FitnessApp;
import java.util.Scanner;

import FitnessApp.Models.User;
import FitnessApp.States.AgePrompt;
import FitnessApp.States.State;

public class FitnessApplication {
    private State currentState;
    private Scanner scanner;
    private User currentUser;

    public FitnessApplication() {
        currentState = new AgePrompt(this);
        scanner = new Scanner(System.in);
        currentUser = new User();
    }

    public void run() {
        while (true) {
            currentState.display();
            
            String userInput = scanner.nextLine();

            currentState.handleUserInput(userInput);
        }
    }

    public void setCurrentState(State state) { currentState = state; }

    public void setCurrentUser(User user) {
        currentUser = user;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void closeApplication() {
        System.out.println();
        System.out.println("De app wordt afgesloten.");

        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.exit(0);
    }

    public boolean isValidInteger(String input) {
        try
        {
            Integer.parseInt(input);
            
            return true;
        }
        catch(NumberFormatException  e)
        {
            System.out.println("Alleen cijfers zijn toegestaan.");

            return false;
        }
    }
}