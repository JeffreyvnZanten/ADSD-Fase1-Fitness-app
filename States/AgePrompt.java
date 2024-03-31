package FitnessApp.States;

import FitnessApp.FitnessApplication;
import FitnessApp.Utils.ConsoleColors;

public class AgePrompt extends State {
    private FitnessApplication app;

    public AgePrompt(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nWat is je leeftijd?");
    }

    public void handleUserInput(String input) {
        if(app.isValidInteger(input)) {
            int age = Integer.parseInt(input);

            if(isRequiredAge(age)) {
                app.getCurrentUser().setAge(age);
                app.setCurrentState(new NamePrompt(app));
            }
            else {
                app.closeApplication();
            }
        }
    }
    
    private boolean isRequiredAge(int age) {
        if (age < 18) {
            System.out.println();
            ConsoleColors.printRedText("Voor het gebruik van deze app moet je 18 jaar of ouder zijn.");

            return false;
        }
        else return true;
    }
}